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

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getObjectCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectCount);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setObjectCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectCount, valuePointer, sizeof(o->objectCount));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPObjectEntryTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectEntryTypes);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPObjectEntryTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectEntryTypes, &valuePointer, sizeof(o->pObjectEntryTypes));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPObjectEntryCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectEntryCounts);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPObjectEntryCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectEntryCounts, &valuePointer, sizeof(o->pObjectEntryCounts));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getPObjectEntryUsageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectEntryUsageFlags);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setPObjectEntryUsageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectEntryUsageFlags, &valuePointer, sizeof(o->pObjectEntryUsageFlags));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxUniformBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxUniformBuffersPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxUniformBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxUniformBuffersPerDescriptor, valuePointer, sizeof(o->maxUniformBuffersPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxStorageBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxStorageBuffersPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxStorageBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxStorageBuffersPerDescriptor, valuePointer, sizeof(o->maxStorageBuffersPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxStorageImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxStorageImagesPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxStorageImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxStorageImagesPerDescriptor, valuePointer, sizeof(o->maxStorageImagesPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxSampledImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSampledImagesPerDescriptor);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxSampledImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSampledImagesPerDescriptor, valuePointer, sizeof(o->maxSampledImagesPerDescriptor));
}

jlong Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_getMaxPipelineLayouts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPipelineLayouts);
}

void Java_cz_mg_vulkan_VkObjectTableCreateInfoNVX_setMaxPipelineLayouts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPipelineLayouts, valuePointer, sizeof(o->maxPipelineLayouts));
}


