# Using the High Performance Computing (HPC) systems at Sheffield

## Description of Sheffield's HPC Systems

The University of Sheffield has two HPC systems:-

* [Sharc](http://docs.hpc.shef.ac.uk/en/latest/sharc/) Sheffield's newest system. It contains about 2000 CPU cores all of which are latest generation.
* [Iceberg](http://docs.hpc.shef.ac.uk/en/latest/iceberg/) Iceberg is Sheffield's old system. It contains 3440 CPU cores but many of them are very old.


<h2>Connecting to the HPC systems from Windows</h2>

To use the HPC from a Windows machine, you need a way to connect - we recommend you install  <tt>mobaXterm</tt>. This is available from [http://mobaxterm.mobatek.net](http://mobaxterm.mobatek.net). On a University machine, you need to install the <tt>portable</tt> version (highlighted in the image below):

<img src="images/mobaXterm_download.png" />

You can install the full version if you wish to install <tt>mobaXterm</tt> on your own machine. (Note that you can connect to <tt>iceberg</tt> from any location, but will need to be on the University network or use VPN to connect to <tt>sharc</tt>.)

<tt>mobaXterm</tt> also contains <tt>mobaTextEditor</tt> which you can use to write your programs.

<h2>Using <tt>iceberg</tt></h2>

You can connect to <tt>iceberg</tt> and <tt>sharc</tt> via <tt>mobaXterm</tt>:

<img src="images/mobaXterm_new_session.png" />

To run a <tt>scala</tt> program on a Linux machine, it will need to be compiled using the [Scala build tool](http://www.scala-sbt.org/). This requires a very strict directory structure <b>and</b> a <tt>.sbt</tt> file specifying dependencies. We illustrate this on the <tt>helloWorld</tt> example.

<h4>Create the directory structure</h4>

1. Start by creating the project directory at the top (<tt>~</tt>) level. We call this <tt>hello</tt> in this case.
2. Then create the directory structure required by <tt>sbt</tt>

You can control directory creation via the <tt>mobaXterm</tt> session:

<img src="images/mobaXterm_newdir.png" />

or you can do everything via the command line by typing the following:

<img src="images/mkdir_example.png" />

Either way, you need to create the above 4 embedded directories.

<h4>Create <tt>.sbt</tt> file and <tt>.scala</tt> file on the Windows machine</h4>

The <tt>.sbt</tt> file contains the dependencies required by the program. Take a look at the <tt>.sbt</tt> file included [here](files/hello.sbt) for the <tt>helloWorld</tt> program. The <tt>.scala</tt> program is also [available](files/HelloWorld.scala).

<h4>Copy the <tt>.sbt</tt> file over to the HPC</h4>

The <tt>.sbt</tt> file needs to be placed at the top level of the project.

<img src="images/mobaXterm_upload.png" />

<h4>Copy the <tt>.scala</tt> file over to the HPC</h4>

The <tt>.scala</tt> file needs to be placed in the <tt>scala</tt> directory.

<h4>Compile the project</h4>

<img src="images/mobaXterm_sbt_package.png" />

<h4>Import spark and run program</h4>

<img src="images/spark_submit.png" />
