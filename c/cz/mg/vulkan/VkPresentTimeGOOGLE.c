#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPresentTimeGOOGLE_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentTimeGOOGLE);
}

jlong Java_cz_mg_vulkan_VkPresentTimeGOOGLE_getPresentID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->presentID);
}

void Java_cz_mg_vulkan_VkPresentTimeGOOGLE_setPresentID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->presentID, valuePointer, sizeof(o->presentID));
}

jlong Java_cz_mg_vulkan_VkPresentTimeGOOGLE_getDesiredPresentTime(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->desiredPresentTime);
}

void Java_cz_mg_vulkan_VkPresentTimeGOOGLE_setDesiredPresentTime(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->desiredPresentTime, valuePointer, sizeof(o->desiredPresentTime));
}


