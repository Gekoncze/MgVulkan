#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceVariablePointerFeaturesKHR);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_getVariablePointersStorageBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->variablePointersStorageBuffer);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_setVariablePointersStorageBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->variablePointersStorageBuffer, valuePointer, sizeof(o->variablePointersStorageBuffer));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_getVariablePointersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->variablePointers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeaturesKHR_setVariablePointersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeaturesKHR* o = (VkPhysicalDeviceVariablePointerFeaturesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->variablePointers, valuePointer, sizeof(o->variablePointers));
}


