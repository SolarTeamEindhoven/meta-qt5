require qt5.inc
require qt5-git.inc

LICENSE = "BSD & (LGPL-2.1 & Digia-Qt-LGPL-Exception-1.1 | LGPL-3.0)"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
"

DEPENDS += "qtbase qtdeclarative qtxmlpatterns"

QT_MODULE_BRANCH = "1.2"
SRCREV = "efac3cd245e2610924133e304d15bf726f5864f5"
