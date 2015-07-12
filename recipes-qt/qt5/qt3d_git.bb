require qt5.inc
require qt5-git.inc

LICENSE = "GFDL-1.3 & LGPL-2.1 & DIGIA-TPLA-2.4 | GPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
    file://LICENSE.GPL;md5=05832301944453ec79e40ba3c3cfceec \
"

DEPENDS = "qtdeclarative"

FILES_${PN}-qmlplugins += " \
    ${OE_QMAKE_PATH_QML}/*/*/*.bez \
    ${OE_QMAKE_PATH_QML}/*/*/*.obj \
"

SRCREV = "298c9012a1c564ce6b6a40af012ebf5c8f1b9d57"
