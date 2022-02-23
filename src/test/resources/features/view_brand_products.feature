@view_all_products

  Feature: @view_all_products
Scenario: TC18_ViewBrandProducts
    When verify that brands are visible on left sidebar
    When user clicks on any brand name
    When verify that user is navigated to brand page and brand products are displayed
    When On left sidebar, click on any other brand link
    When verify that user is navigated to that brand page and can see products
