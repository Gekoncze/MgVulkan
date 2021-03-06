#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRefreshCycleDurationGOOGLE_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRefreshCycleDurationGOOGLE);
}

void Java_cz_mg_vulkan_VkRefreshCycleDurationGOOGLE_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkRefreshCycleDurationGOOGLE));
}

jlong Java_cz_mg_vulkan_VkRefreshCycleDurationGOOGLE_getRefreshDurationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRefreshCycleDurationGOOGLE* o = (VkRefreshCycleDurationGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&o->refreshDuration);
}

void Java_cz_mg_vulkan_VkRefreshCycleDurationGOOGLE_setRefreshDurationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRefreshCycleDurationGOOGLE* o = (VkRefreshCycleDurationGOOGLE*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->refreshDuration, valuePointer, sizeof(o->refreshDuration));
}


