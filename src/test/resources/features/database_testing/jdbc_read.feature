Feature: database_read_feature
  Background: connect_database
    Given user connects to the database
  @db_customer_ssn
  Scenario: TC01_read_customer_ssn_information
    And user gets "*" from "tp_customer" table
    And user reads all the "ssn" column data
    Then close the database connection
  @db_customer_address
  Scenario: TC02_read_customer_address_information
    And user gets "*" from "tp_customer" table
    And user reads all the "address" column data
    Then close the database connection
  @db_customer_email
  Scenario: TC03_read_customer_email_information
    And user gets "*" from "tp_customer" table
    And user reads all the "email" column data
    Then close the database connection
  @db_user_email
  Scenario: TC04_read_customer_email_information
    And user gets "*" from "jhi_user" table
    And user reads all the "email" column data
    Then close the database connection
  @db_login_email
  Scenario: TC05_read_customer_email_information
    And user gets "*" from "jhi_user" table
    And user reads all the "login" column data
    Then close the database connection
  @db_user_login_verify
  Scenario: TC06_verify_user_login
    And user gets "*" from "jhi_user" table
    Then verify "jhi_user" table "login" column contains "user9"
    Then close the database connection
  @db_user_email_verify
  Scenario: TC07_verify_user_email
    And user gets "*" from "jhi_user" table
    Then verify "jhi_user" table "email" column contains "miquel.okon@hotmail.com"
    Then close the database connection
#In tp_account table, account_type column, check SAVING data
  @db_account_type
  Scenario: TC08_verify_account_type
#   And user gets "*" from "tp_account" table
    Then verify "tp_account" table "account_type" column contains "SAVING"
    Then verify "tp_account" table "account_type" column contains "CREDIT_CARD"
    Then verify "tp_account" table "account_type" column contains "CHECKING"
#   Then verify "tp_account" table "account_type" column contains "DEBIT"
    Then close the database connection
  @db_user_count
  Scenario: TC09
    And user gets "*" from "jhi_user" table
#   I want to learn the number of rows
    Then read the row count of "jhi_user" table
    And read the column names of "jhi_user" table




