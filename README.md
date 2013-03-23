Berkelium - library for off-screen browser rendering
====================================================

About
-----
Warning: This is work in progress and not usable yet! See https://github.com/sirikata/berkelium for the current version.

Berkelium (http://berkelium.org) is a BSD licensed (http://opensource.org/licenses/bsd-license.php) library that provides off-screen browser rendering via Google's open source Chromium (http://www.chromium.org/) web browser.

It takes advantage of Chromium's multiprocess rendering to isolate browsers from each other and can render to any buffer in memory. The user of the library can inject input and javascript code into web pages to control them, as well as listen for events generated by the page such as navigation events, load sequence events and paint events. Berkelium provides a small API for embedding a fully functional browser into any application.

You can see the latest supported chromium version in this file: chromium/.gclient


Supported Platforms
-------------------
You can use the Berkelium API with this programming languages / platforms:
* C
* C++
* Java
* .net

on this Operating Systems:
* Windows
* Linux
* Mac OSX

Supported are 32 bit and 64 bit systems.

Documentation
-------------
API Documentation (The API is as much as possible identical for all supported languages) can be found [here](berkelium-api).

Build instructions can be found in every project directory, see building.md.

Projects:
* **chromium**  
This directory is used to build chromium and is needed by berkelium-host
* **berkelium-host**  
This project contains a patched chromium executable which is used by the other berkelium librarys
* **berkelium-api**  
This project contains a XML Description of the Berkelium API. All language bindings are automaticly generated using XSLT.
* **berkelium-c**  
C API (Exports C-Style Functions, internally the c++ API is used)
* **berkelium-cpp**  
This contains the main implementation of the Berkelium API.
* **berkelium-java**  
Java API (the JNI Code internally uses the c++ API)
* **berkelium-net**  
.net API for VB.net C# etc. (internally the c++ API is used)

Support
-------
Our mailing list is available at http://groups.google.com/group/berkelium

Before asking a question, search on google with "berkelium", which will also
find discussions in the old list archives as well.
If you can't find the answer in the archives, feel free to ask a question to
the mailing list.

The authors below should be used only as a last resort, or for private matters.

Authors
-------
*(feel free to commit your own name/organization here)*

Main contributors (Berkelium based on Chromium Version > 20):
* Dennis Rieks <dennisrieks@googlemail.com>

Main contributors (Berkelium based on Chromium Version < 20):
* Patrick Reiter Horn <patrick.horn@gmail.com>
* Ewen Cheslack-Postava <ewencp@cs.stanford.edu>
* kevin Gadd <kevin.gadd@gmail.com>
* Daniel Reiter Horn <danielrh@users.sourceforge.net>
* Dennis Rieks <dennisrieks@googlemail.com>
