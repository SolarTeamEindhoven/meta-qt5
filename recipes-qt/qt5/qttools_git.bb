require qt5.inc
require qt5-git.inc

LICENSE = "GFDL-1.3 & BSD & (LGPL-2.1 & Digia-Qt-LGPL-Exception-1.1 | LGPL-3.0)"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv21;md5=d87ae0d200af76dca730d911474cbe5b \
    file://LICENSE.LGPLv3;md5=ffcfac38a32c9ebdb8ff768fa1702478 \
    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
"

DEPENDS += "qtbase qtdeclarative qtxmlpatterns"

SRC_URI += " \
    file://0002-assistant-help-fix-linking-of-dependent-libraries.patch \
    file://0003-add-noqtwebkit-configuration.patch \
"

FILES_${PN}-tools += "${datadir}/${QT_DIR_NAME}/phrasebooks"
FILES_${PN}-examples = "${datadir}/${QT_DIR_NAME}/examples"

PACKAGECONFIG ??= ""
PACKAGECONFIG[qtwebkit] = ",,qtwebkit"

EXTRA_QMAKEVARS_PRE += "${@base_contains('PACKAGECONFIG', 'qtwebkit', '', 'CONFIG+=noqtwebkit', d)}"

SRCREV = "33c65366a7c3901d2aecfde3dbc485e1eac5c10c"
