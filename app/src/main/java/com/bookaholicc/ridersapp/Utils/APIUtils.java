package com.bookaholicc.ridersapp.Utils;

import org.json.JSONObject;

/**
 * Created by nandhu on 21/3/17.
 * The Class Which Manages API
 *
 * // TODO: 21/3/17 Build the Fucking API 's soon
 */

public class APIUtils {




   /*Home API - NEW ARRIVALS*/

    public static final String HOME_ENDPOINT_NEW_ARRIALS = "";



    /* HOME _ POPULAR*/
    public static final String HOME_ENDPOINT_POPULAR = "";



    /*HOME - OFFERS*/
    public static final String HOME_ENDPOINT_OFFERS = "";


    /*CATEGORIES */
    public static final String HOME_API = "https://us-central1-bookaholic-786.cloudfunctions.net/home";

        //The Keys Assciated with that time
    public static final String PID = "pid";
    public static final String PRODUCT_NAME = "pName";
    public static final String PRODUCT_DESC = "productDescription";
    public static final String AUTHOR_NAME = "authorName";
    public static final String MRP = "MRP";

    public static final String PUBLISHER_NAME = "publisherName";
    public static final String IS_TOP_RATED ="isTopRated";
    public static final String IS_BEST_SELLER = "isBestSeller";
    public static final String BOOK_SUMMARY = "bookSummary";
    public static final String BASE_CATEGORY = "baseCategory";
    public static final String SUB_CATEGORY = "subCategory";
    public static final String QUANTITY = "quantity";
    public static final String DETAILS_OBJ = "details";
    public static final String ISBN = "ISBN";
    public static final String ISBN13 = "ISBN13";
    public static final String PRICING_OBJECT = "pricing";
    public static final String UNIT_1 = "unit";
    public static final String UNIT_2 = "timeUnit";
    public static final String UNIT_3 = "price";








    /*Pass in "riderId - to get Orders Assigned to this Rider*/
    public static String RIDER_GET_ORDERS_API = "";
    public static String SAVE_TOKEN_API = "";




    /*REGISTER API - Provide first name , last name , email , password*/
    public static final String  REGISTER_API = "";
    public static final String PHONE_NUMBER = "phoneNumber";
    public static String OUR_PRICE = "ourPrice";
    public static String DURATION="duration";
    public static String IMAGE_URL ="imageURL";
    public static String COMBO_ID = "comboId";
    public static String COMBO_NAME ="comboName";
    public static String C_IMAGE_URL = "imageURL";
    public static String COMBO_DESC = "comboDescription";

    public static String FIRST_NAME = "firstName";
    public static String PRODUCTS_KEYWORD = "products";
    public static String ORDER_LAT = "orderLat";
    public static String ORDER_LON = "orderLon";
    public static String AMOUNT = "amount";
    public static String IS_ACCEPTED = "isAccepted";
    public static String ORDER_ID = "orderId";
    public static String ORDER_ACCEPTED = "orderInsertedAt";
    public static String USER_ID = "userId";
    public static String TOKEN_ID = "tokenId";
    public static String PROFILE_ID = "profileId";
    public static String FROM_WHERE = "fromWhere";
    public static String RIDER_ID = "riderId";

}
