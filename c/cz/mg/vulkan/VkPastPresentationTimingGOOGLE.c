#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPastPresentationTimingGOOGLE);
}

jlong Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_getPresentID(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->presentID));
}

void Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_setPresentID(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    memcpy(&o->presentID, jniLongToPointer(valueAddress), sizeof(o->presentID));
}
jlong Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_getDesiredPresentTime(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->desiredPresentTime));
}

void Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_setDesiredPresentTime(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    memcpy(&o->desiredPresentTime, jniLongToPointer(valueAddress), sizeof(o->desiredPresentTime));
}
jlong Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_getActualPresentTime(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->actualPresentTime));
}

void Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_setActualPresentTime(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    memcpy(&o->actualPresentTime, jniLongToPointer(valueAddress), sizeof(o->actualPresentTime));
}
jlong Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_getEarliestPresentTime(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->earliestPresentTime));
}

void Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_setEarliestPresentTime(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    memcpy(&o->earliestPresentTime, jniLongToPointer(valueAddress), sizeof(o->earliestPresentTime));
}
jlong Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_getPresentMargin(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->presentMargin));
}

void Java_cz_mg_vulkan_vk_VkPastPresentationTimingGOOGLE_setPresentMargin(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    memcpy(&o->presentMargin, jniLongToPointer(valueAddress), sizeof(o->presentMargin));
}

