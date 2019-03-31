#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableCreateInfoNVX);
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getObjectCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->objectCount));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setObjectCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->objectCount, jniLongToPointer(valueAddress), sizeof(o->objectCount));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getPObjectEntryTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pObjectEntryTypes));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setPObjectEntryTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->pObjectEntryTypes, jniLongToPointer(valueAddress), sizeof(o->pObjectEntryTypes));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getPObjectEntryCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pObjectEntryCounts));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setPObjectEntryCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->pObjectEntryCounts, jniLongToPointer(valueAddress), sizeof(o->pObjectEntryCounts));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getPObjectEntryUsageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pObjectEntryUsageFlags));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setPObjectEntryUsageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->pObjectEntryUsageFlags, jniLongToPointer(valueAddress), sizeof(o->pObjectEntryUsageFlags));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getMaxUniformBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxUniformBuffersPerDescriptor));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setMaxUniformBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->maxUniformBuffersPerDescriptor, jniLongToPointer(valueAddress), sizeof(o->maxUniformBuffersPerDescriptor));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getMaxStorageBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxStorageBuffersPerDescriptor));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setMaxStorageBuffersPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->maxStorageBuffersPerDescriptor, jniLongToPointer(valueAddress), sizeof(o->maxStorageBuffersPerDescriptor));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getMaxStorageImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxStorageImagesPerDescriptor));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setMaxStorageImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->maxStorageImagesPerDescriptor, jniLongToPointer(valueAddress), sizeof(o->maxStorageImagesPerDescriptor));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getMaxSampledImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSampledImagesPerDescriptor));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setMaxSampledImagesPerDescriptor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->maxSampledImagesPerDescriptor, jniLongToPointer(valueAddress), sizeof(o->maxSampledImagesPerDescriptor));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_getMaxPipelineLayouts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPipelineLayouts));
}

void Java_cz_mg_vulkan_vk_VkObjectTableCreateInfoNVX_setMaxPipelineLayouts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableCreateInfoNVX* o = (VkObjectTableCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->maxPipelineLayouts, jniLongToPointer(valueAddress), sizeof(o->maxPipelineLayouts));
}

