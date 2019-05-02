#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableCreateInfoNVX);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkObjectTableCreateInfoNVX));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getObjectCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectCount);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setObjectCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectCount, valuePointer, sizeof(o->objectCount));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPObjectEntryTypesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectEntryTypes);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPObjectEntryTypesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectEntryTypes, &valuePointer, sizeof(o->pObjectEntryTypes));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPObjectEntryCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectEntryCounts);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPObjectEntryCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectEntryCounts, &valuePointer, sizeof(o->pObjectEntryCounts));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPObjectEntryUsageFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectEntryUsageFlags);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPObjectEntryUsageFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectEntryUsageFlags, &valuePointer, sizeof(o->pObjectEntryUsageFlags));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxUniformBuffersPerDescriptorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxUniformBuffersPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxUniformBuffersPerDescriptorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxUniformBuffersPerDescriptor, valuePointer, sizeof(o->maxUniformBuffersPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxStorageBuffersPerDescriptorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxStorageBuffersPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxStorageBuffersPerDescriptorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxStorageBuffersPerDescriptor, valuePointer, sizeof(o->maxStorageBuffersPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxStorageImagesPerDescriptorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxStorageImagesPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxStorageImagesPerDescriptorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxStorageImagesPerDescriptor, valuePointer, sizeof(o->maxStorageImagesPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxSampledImagesPerDescriptorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSampledImagesPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxSampledImagesPerDescriptorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSampledImagesPerDescriptor, valuePointer, sizeof(o->maxSampledImagesPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxPipelineLayoutsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPipelineLayouts);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxPipelineLayoutsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPipelineLayouts, valuePointer, sizeof(o->maxPipelineLayouts));
}


