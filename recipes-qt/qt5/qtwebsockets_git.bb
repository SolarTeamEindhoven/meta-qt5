require qt5.inc
require qt5-git.inc

LICENSE = "GFDL-1.3 & (LGPL-2.1 & Digia-Qt-LGPL-Exception-1.1 | LGPL-3.0)"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4fbd65380cdd255951079008b364516c \
    file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
    file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec \
"

DEPENDS += "qtbase qtdeclarative"

SRCREV = "158ec0ca22f8f6713eb80f737eb8d0ef84f515ac"
