Use Cases
*********

A sensor for Colectme
=====================

Colectme is a set of tools developed in the `EAM-SDI project <https://www.cetic.be/EAM-SDI-2301>`_ for collecting, storing,
and processing log data from data centers.

The TSimulus library has been used in this project as a data source exploited by `a gateway <https://gitlab.com/colectme/gateway>`_
in order to simulate log events representing the history of resources consumption.

Sensors simulation for FADI
=====================

`FADI <https://fadi.cetic.be/>`_ is a Cloud Native platform for Big Data based on mature open source tools. The FADI project is dedicated to making the deployment of Big Data tools simple, portable and scalable. The goal is to provide a straightforward way to deploy open-source systems for Big Data to various infrastructures (private and public clouds). Anywhere you can run Kubernetes, you should be able to run FADI.

The TSimulus library has been used to simulate various sensors from industrial partners in the context of these `many research projects <https://github.com/cetic/fadi#thanks>`_. It allowed to generate a suffisant amout of data to test the entire FADI platform. It was usefull when there was a lack of real time data streams. TSimulus allowed to already work on the analysis part without having the real data from the partners. 
