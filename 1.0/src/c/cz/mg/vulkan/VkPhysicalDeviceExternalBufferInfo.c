#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceExternalBufferInfo);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceExternalBufferInfo));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_getUsageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->usage);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_setUsageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->usage, valuePointer, sizeof(o->usage));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_getHandleTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->handleType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceExternalBufferInfo_setHandleTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalBufferInfo* o = (VkPhysicalDeviceExternalBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->handleType, valuePointer, sizeof(o->handleType));
}


