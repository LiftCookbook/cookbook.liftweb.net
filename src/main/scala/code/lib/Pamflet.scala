package code.lib

import net.liftweb.http.Req

object PamfletUrl {

  type PamfletPage = String
  type HtmlSectionName = String

  val redirect = Map[PamfletPage, HtmlSectionName](
    "About this text.html" -> "#_about_this_text",
    "Install and Running.html" -> "#InstallAndRunning",
    "Downloading and running Lift.html" -> "#DownloadAndRun",
    "Developing using a text editor.html" -> "#texteditor",
    "Developing using Eclipse.html" -> "#eclipse",
    "Viewing the lift_proto H2 database.html" -> "#ViewH2",
    "Using the latest Lift build.html" -> "#snapshot",
    "Using a new version of Scala.html" -> "#NewScala",
    "HTML.html" -> "#HTML",
    "Testing and debugging CSS selectors.html" -> "#TestingAndDebuggingSelectors",
    "Sequencing CSS selector operations.html" -> "#SequencingSelectorOps",
    "Setting meta tag contents.html" -> "#SetMetaTag",
    "Setting the page title.html" -> "#SetPageTitle",
    "Including HTML5 Shiv.html" -> "#ConditionalIncludes",
    "Adding a Google +1 button.html" -> "removed.html",
    "Returning snippet markup unchanged.html" -> "#PassThru",
    "Snippet not found when using HTML5.html" -> "#SnippetNotFound",
    "Avoiding CSS and JavaScript caching.html" -> "#AvoidAssetCaching",
    "Adding to the head of a page.html" -> "#AddToHead",
    "Custom 404 page.html" -> "#Custom404",
    "Other custom status pages.html" -> "#CustomStatusPage",
    "Links in notices.html" -> "#LinksInNotice",
    "Rendering Textile markup.html" -> "#Textile",
    "Access restriction by HTTP header.html" -> "#RestrictByHeader",
    "Forms processing in Lift.html" -> "#Forms",
    "Plain old form processing.html" -> "#PlainFormProcessing",
    "Ajax form processing.html" -> "#AjaxFormProcessing",
    "Ajax JSON form processing.html" -> "#JsonForms",
    "Conditionally disable a checkbox.html" -> "#DisableCheckbox",
    "Use a select box with multiple options.html" -> "#MultiSelectBox",
    "REST.html" -> "#REST",
    "DRY URLs.html" -> "#DRYURLs",
    "Google Sitemap.html" -> "#GoogleSitemap",
    "Missing file suffix.html" -> "#MissingSuffix",
    "Failing to match on a file suffix.html" -> "#SuffixMatchFail",
    "Accept binary data in a REST service.html" -> "#RestBinaryData",
    "Returning JSON.html" -> "#JSONREST",
    "Javascript, Ajax, Comet.html" -> "#Ajax",
    "Trigger server-side code from a button press.html" -> "#ButtonTriggerServerCode",
    "Set up client-side actions from your Scala code.html" -> "#ClientSideOnlyActions",
    "Focus on a field on page load.html" -> "#FocusOnLoad",
    "Add CSS class to an Ajax Form.html" -> "#CSSClassOnAjaxForm",
    "Show a template inside a page dynamically.html" -> "#DynamicTemplateLoading",
    "Pipeline.html" -> "#Pipeline",
    "Streaming content.html" -> "#RestStreamContent",
    "Serving a file with access control.html" -> "#DiskAccessControl",
    "Debugging a request.html" -> "#DebugRequest",
    "Running code when sessions are created (or destroyed).html" -> "#OnSession",
    "Run code when Lift shutsdown.html" -> "#ShutdownHooks",
    "Running stateless.html" -> "#RunningStateless",
    "Catch any exception.html" -> "#CatchException",
    "Accessing HttpServletRequest.html" -> "#HttpServletRequest",
    "Secure requests only.html" -> "#_secure_requests_only",
    "Relational database persistence with Record and Squeryl.html" -> "#Squeryl",
    "Using a JNDI datasource.html" -> "#SquerylJNDI",
    "Adding validation to a field.html" -> "#FieldValidation",
    "Implementing custom validation logic.html" -> "#CustomValidation",
    "Modify a field value before it is set.html" -> "#SquerylFilter",
    "Put a random value in a column.html" -> "#RandomValueColumn",
    "Automatic created and updated timestamps for a Squeryl Record.html" -> "#SquerylUpdatedCreated",
    "Logging SQL.html" -> "#SquerylLogging",
    "Model a column with MySQL MEDIUMTEXT.html" -> "#SquerylMediumText",
    "Relational database persistence with Mapper.html" -> "#_relational_database_persistence_with_mapper",
    "Sequence numbers and existing data.html" -> "#_sequence_numbers_and_existing_data",
    "Detect if the schema has changed.html" -> "#_detect_if_the_schema_has_changed",
    "MongoDB persistence with Record.html" -> "#_mongodb_persistence_with_record",
    "Connecting to a Mongo database.html" -> "#ConnectingToMongo",
    "Storing a hash in a Mongo record.html" -> "#MongoHashMap",
    "Embedding a document inside a Mongo record.html" -> "#MongoEmbedding",
    "Linking between Mongo records.html" -> "#_linking_between_mongo_records",
    "Storing geospatial values.html" -> "#MongoGeospatial",
    "In and Around Lift.html" -> "#Around",
    "Sending plain text email.html" -> "#SendTextEmail",
    "Sending HTML email.html" -> "#HTMLEmail",
    "Sending authenticated email.html" -> "#AuthEmail",
    "Sending email with attachments.html" -> "#EmailWithAttachments",
    "Logging email rather than sending.html" -> "#LogEmail",
    "Run a task later.html" -> "#RunLater",
    "Run tasks periodically.html" -> "#RunTasksPeriodically",
    "Fetching URLs.html" -> "#FetchURLs",
    "Production deployment.html" -> "#deployment",
    "Deploying to CloudBees.html" -> "#CloudBees",
    "MySQL unicode charset encoding.html" -> "#MySQLCharSet",
    "Contributing, bug reports & getting help.html" -> "#ContributingAndHelp",
    "How to add a new recipe to this Cookbook.html" -> "#AddRecipe",
    "How to report bugs.html" -> "#HowToReportBugs"
  )

  def unapply(req: Req): Option[String] = redirect get (req path 0)

}