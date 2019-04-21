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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSubgroupSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->subgroupSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSubgroupSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subgroupSize, valuePointer, sizeof(o->subgroupSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSupportedStages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedStages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSupportedStages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedStages, valuePointer, sizeof(o->supportedStages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getSupportedOperations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedOperations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setSupportedOperations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedOperations, valuePointer, sizeof(o->supportedOperations));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_getQuadOperationsInAllStages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->quadOperationsInAllStages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSubgroupProperties_setQuadOperationsInAllStages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSubgroupProperties* o = (VkPhysicalDeviceSubgroupProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->quadOperationsInAllStages, valuePointer, sizeof(o->quadOperationsInAllStages));
}


