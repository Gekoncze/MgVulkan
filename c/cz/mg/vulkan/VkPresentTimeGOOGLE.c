#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPresentTimeGOOGLE_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentTimeGOOGLE);
}

jlong Java_cz_mg_vulkan_vk_VkPresentTimeGOOGLE_getPresentID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->presentID));
}

void Java_cz_mg_vulkan_vk_VkPresentTimeGOOGLE_setPresentID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    memcpy(&o->presentID, jniLongToPointer(valueAddress), sizeof(o->presentID));
}
jlong Java_cz_mg_vulkan_vk_VkPresentTimeGOOGLE_getDesiredPresentTime(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->desiredPresentTime));
}

void Java_cz_mg_vulkan_vk_VkPresentTimeGOOGLE_setDesiredPresentTime(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimeGOOGLE* o = (VkPresentTimeGOOGLE*)jniLongToPointer(address);
    memcpy(&o->desiredPresentTime, jniLongToPointer(valueAddress), sizeof(o->desiredPresentTime));
}

