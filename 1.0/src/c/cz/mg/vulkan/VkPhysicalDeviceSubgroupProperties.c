#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSubgroupProperties);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceSubgroupProperties));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSubgroupSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->subgroupSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSubgroupSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subgroupSize, valuePointer, sizeof(o->subgroupSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSupportedStagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedStages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSupportedStagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedStages, valuePointer, sizeof(o->supportedStages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSupportedOperationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedOperations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSupportedOperationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedOperations, valuePointer, sizeof(o->supportedOperations));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getQuadOperationsInAllStagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->quadOperationsInAllStages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setQuadOperationsInAllStagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->quadOperationsInAllStages, valuePointer, sizeof(o->quadOperationsInAllStages));
}


