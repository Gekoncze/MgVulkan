#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPastPresentationTimingGOOGLE);
}

void Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPastPresentationTimingGOOGLE));
}

jlong Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_getPresentIDNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->presentID);
}

void Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_setPresentIDNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->presentID, valuePointer, sizeof(o->presentID));
}

jlong Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_getDesiredPresentTimeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->desiredPresentTime);
}

void Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_setDesiredPresentTimeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->desiredPresentTime, valuePointer, sizeof(o->desiredPresentTime));
}

jlong Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_getActualPresentTimeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->actualPresentTime);
}

void Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_setActualPresentTimeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->actualPresentTime, valuePointer, sizeof(o->actualPresentTime));
}

jlong Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_getEarliestPresentTimeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->earliestPresentTime);
}

void Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_setEarliestPresentTimeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->earliestPresentTime, valuePointer, sizeof(o->earliestPresentTime));
}

jlong Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_getPresentMarginNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->presentMargin);
}

void Java_cz_mg_vulkan_VkPastPresentationTimingGOOGLE_setPresentMarginNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPastPresentationTimingGOOGLE* o = (VkPastPresentationTimingGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->presentMargin, valuePointer, sizeof(o->presentMargin));
}


