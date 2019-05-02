#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

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

void Java_cz_mg_vulkan_VkPresentTimeGOOGLE_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPresentTimeGOOGLE));
}

jlong Java_cz_mg_vulkan_VkPresentTimeGOOGLE_getPresentIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->presentID);
}

void Java_cz_mg_vulkan_VkPresentTimeGOOGLE_setPresentIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->presentID, valuePointer, sizeof(o->presentID));
}

jlong Java_cz_mg_vulkan_VkPresentTimeGOOGLE_getDesiredPresentTimeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->desiredPresentTime);
}

void Java_cz_mg_vulkan_VkPresentTimeGOOGLE_setDesiredPresentTimeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->desiredPresentTime, valuePointer, sizeof(o->desiredPresentTime));
}


