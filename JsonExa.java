package in.demo.maven.KafkaExa;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonExa
{

public static void main(String[] args)
{


}

String abc() {


JsonObject mainObject=new JsonObject();
mainObject.addProperty("action","Insert");//1. entity added action
// II)
// create dataArray
JsonArray dataArray=new JsonArray();

// create dataObject
JsonObject dataObject=new JsonObject();

// 1)create actionArray
JsonArray actionArray=new JsonArray();
actionArray.add("INS_PRD");

// 2)create cailmail object
JsonObject cailmail=new JsonObject();
cailmail.addProperty("activeStatus", 1);
cailmail.addProperty("keyType", "TSK");
cailmail.addProperty("subkeyType", "TSK_PRD_LST");
cailmail.addProperty("cmlTitle", "title1");
cailmail.addProperty("Ref_id", "domain#TSK_PRD");

// 3)create essential list object/array
JsonObject essentialList=new JsonObject();
essentialList.addProperty("key", "value");

// add all 3 entities in data object
dataObject.add("actionArray",actionArray);
dataObject.add("cailmail",cailmail);
dataObject.add("essentialList",essentialList);

// add dataObject in dataArray
dataArray.add(dataObject);

// add dataArray to mainObject
mainObject.add("dataArray",dataArray);//add() used when any of args is String or a value
// III)
// add remaining entities in mainObject
mainObject.addProperty("Module Name","PRD");//addProperty() used when both args are Strings
mainObject.addProperty("requestId","xyz");
mainObject.addProperty("socketId","");
mainObject.addProperty("authenticationToken","QWER");


String s2=String.valueOf(mainObject);

return s2;





// String sr=mainObject.getAsJsonObject().get("action").getAsString();
// System.out.println(sr);
//
// String cl=dataObject.getAsJsonObject().get("cailmail").getAsJsonObject().get("Ref_id").getAsString();
// System.out.println(cl);
//
// String es=essentialList.getAsJsonObject().get("key").getAsString();
// System.out.println(es);
}





}
