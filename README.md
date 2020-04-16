
# ActivityLifeCycle App
Developed a simple app for the activity life cycle flow callbacks . 


# Overview

The app does the following:

App having 2 pages First Page and Second Page which will explain the callback methods of first page and second page in android log cat Log.e(). 

# To achieve this, there are two pages in this app:

# Once application launch and First page display to user callback for first page is :
First Page::  onCreate

First Page::  onStart

First Page::  onResume

MainActivity - Responsible for executing Next Page click event and open the secon page callback for this page.

# Once user click on the next button of first page following methods callback happens:
First Page::  onPause

Second Page::  onCreate

Second Page::  onStart

Second Page::  onResume

First Page::  onStop


SecondActivity - Responsible for open the second page and click event and open the first page.

# Once user click on the back button of second page following methods callback happens:
Second Page::  onPause

First Page::  onRestart

First Page::  onStart

First Page::  onResume

Second Page::  onStop

Second Page::  onDestroy

# Once user click on the prvious button of the second page instead of clicking back button.
Second Page::  onPause

First Page::  onRestart

First Page::  onStart

First Page::  onResume

Second Page::  onStop

Basically here second page is going into backstack so onDestroy method is not calling of second page if you see diffrence 
of the back button click and previous button click.

# If you click on the Resume button of first page 
First Page::  onPause

First Page::  onStop

And if you come back again same page only following callback happens.
First Page::  onRestart

First Page::  onStart

First Page::  onResume

# If you click on the home buuton of the first page then following callback happens.
First Page::  onPause

First Page::  onStop

And come back again the same page then following callback happens.
First Page::  onRestart

First Page::  onStart

First Page::  onResume

# If you clcim the back button of the first page then folowing callback happens.
First Page::  onPause

First Page::  onStop

First Page::  onDestroy

# Libraries
This app leverages android X.


# For Test App
Clone or Download from this repo.
Open downlaoded project in android studio and just run.
