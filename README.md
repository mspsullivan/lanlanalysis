---
title: "README"
author: "Robert Sullivan"
date: "February 25, 2016"
output: html_document
---

# LANL Analysis
I completed this work to demonstrate my skills in security, cobbling together solutions and data science.

This submission contains three parts.

# First Foray
A forecasting model documented in HTML, R Markdown files and PNG files [HTML Project File](http://htmlpreview.github.com/?https://github.com/mspsullivan/lanlanalysis/blob/master/SullivansLANLProject2.html). This foray includes a chart  [New Edge Chart](https://github.com/mspsullivan/lanlanalysis/blob/master/SullivanLANLProject2EdgeByDay.png) that demonstrates preprocessing and model building with the LANL data set. Using a Generalized Linear Model I built a system that reached 80% accuracy in training and 85% in testing.  
Two .java and one .bat file that were used for preprocessing are posted in the [git repository](https://github.com/mspsullivan/lanlanalysis/).

# Second Foray
This includes a hadoop-constructed input file [snowballcounts.csv] (https://github.com/mspsullivan/lanlanalysis/blob/master/snowballcounts.csv) and screen shots [Cloudera Manager](https://github.com/mspsullivan/lanlanalysis/blob/master/SnowballinputHue.png) and [Hue](https://github.com/mspsullivan/lanlanalysis/blob/master/SnowballinputHue.png). In this foray I computed the "snowball" rating for each user. The HIVE SQL is posted in the [Snowball SQL](https://github.com/mspsullivan/lanlanalysis/blob/master/snowballsql.txt) The screen shots show a 4-cluster Hadoop system using Cloudera, Hive and Hue to compute the snowball identity attack predictor on the full auth.txt log file, 71GB when expanded.
The results from the "second foray" could be used to improve the model and results from foray 1.

# Third Foray
An email [LANL Connections] (http://htmlpreview.github.com/?https://github.com/mspsullivan/lanlanalysis/blob/master/connections.html) to convince Alex that Los Alamos National Labs has discovered and validated my original and compelling work. The suggested, but not built, backing website at connections.lonl.org would contain the full monthly newsletter along with rare praise for the character, talent and insight of Robert Sullivan.

This work took a significant effort. Please send your comments and suggestions to me: msp.sullivan@gmail.com.
Robert Sullivan
