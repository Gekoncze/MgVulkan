#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceLimits);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageDimension1D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimension1D);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimension1D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimension1D, valuePointer, sizeof(o->maxImageDimension1D));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageDimension2D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimension2D);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimension2D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimension2D, valuePointer, sizeof(o->maxImageDimension2D));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageDimension3D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimension3D);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimension3D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimension3D, valuePointer, sizeof(o->maxImageDimension3D));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageDimensionCube(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimensionCube);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimensionCube(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimensionCube, valuePointer, sizeof(o->maxImageDimensionCube));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageArrayLayers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageArrayLayers, valuePointer, sizeof(o->maxImageArrayLayers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTexelBufferElements(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTexelBufferElements);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTexelBufferElements(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTexelBufferElements, valuePointer, sizeof(o->maxTexelBufferElements));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxUniformBufferRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxUniformBufferRange);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxUniformBufferRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxUniformBufferRange, valuePointer, sizeof(o->maxUniformBufferRange));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxStorageBufferRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxStorageBufferRange);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxStorageBufferRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxStorageBufferRange, valuePointer, sizeof(o->maxStorageBufferRange));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPushConstantsSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPushConstantsSize);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPushConstantsSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPushConstantsSize, valuePointer, sizeof(o->maxPushConstantsSize));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxMemoryAllocationCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxMemoryAllocationCount);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxMemoryAllocationCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxMemoryAllocationCount, valuePointer, sizeof(o->maxMemoryAllocationCount));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSamplerAllocationCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSamplerAllocationCount);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSamplerAllocationCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSamplerAllocationCount, valuePointer, sizeof(o->maxSamplerAllocationCount));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getBufferImageGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferImageGranularity);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setBufferImageGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferImageGranularity, valuePointer, sizeof(o->bufferImageGranularity));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSparseAddressSpaceSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseAddressSpaceSize);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSparseAddressSpaceSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseAddressSpaceSize, valuePointer, sizeof(o->sparseAddressSpaceSize));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxBoundDescriptorSets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxBoundDescriptorSets);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxBoundDescriptorSets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxBoundDescriptorSets, valuePointer, sizeof(o->maxBoundDescriptorSets));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorSamplers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorSamplers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorSamplers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorSamplers, valuePointer, sizeof(o->maxPerStageDescriptorSamplers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorUniformBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUniformBuffers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorUniformBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUniformBuffers, valuePointer, sizeof(o->maxPerStageDescriptorUniformBuffers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorStorageBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorStorageBuffers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorStorageBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorStorageBuffers, valuePointer, sizeof(o->maxPerStageDescriptorStorageBuffers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorSampledImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorSampledImages);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorSampledImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorSampledImages, valuePointer, sizeof(o->maxPerStageDescriptorSampledImages));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorStorageImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorStorageImages);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorStorageImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorStorageImages, valuePointer, sizeof(o->maxPerStageDescriptorStorageImages));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorInputAttachments);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorInputAttachments, valuePointer, sizeof(o->maxPerStageDescriptorInputAttachments));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageResources(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageResources);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageResources(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageResources, valuePointer, sizeof(o->maxPerStageResources));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetSamplers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetSamplers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetSamplers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetSamplers, valuePointer, sizeof(o->maxDescriptorSetSamplers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetUniformBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUniformBuffers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetUniformBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUniformBuffers, valuePointer, sizeof(o->maxDescriptorSetUniformBuffers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetUniformBuffersDynamic(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUniformBuffersDynamic);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetUniformBuffersDynamic(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUniformBuffersDynamic, valuePointer, sizeof(o->maxDescriptorSetUniformBuffersDynamic));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetStorageBuffers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetStorageBuffers, valuePointer, sizeof(o->maxDescriptorSetStorageBuffers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageBuffersDynamic(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetStorageBuffersDynamic);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageBuffersDynamic(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetStorageBuffersDynamic, valuePointer, sizeof(o->maxDescriptorSetStorageBuffersDynamic));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetSampledImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetSampledImages);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetSampledImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetSampledImages, valuePointer, sizeof(o->maxDescriptorSetSampledImages));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetStorageImages);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetStorageImages, valuePointer, sizeof(o->maxDescriptorSetStorageImages));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetInputAttachments);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetInputAttachments, valuePointer, sizeof(o->maxDescriptorSetInputAttachments));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputAttributes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputAttributes);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputAttributes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputAttributes, valuePointer, sizeof(o->maxVertexInputAttributes));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputBindings(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputBindings);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputBindings(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputBindings, valuePointer, sizeof(o->maxVertexInputBindings));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputAttributeOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputAttributeOffset);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputAttributeOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputAttributeOffset, valuePointer, sizeof(o->maxVertexInputAttributeOffset));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputBindingStride(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputBindingStride);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputBindingStride(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputBindingStride, valuePointer, sizeof(o->maxVertexInputBindingStride));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexOutputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexOutputComponents, valuePointer, sizeof(o->maxVertexOutputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationGenerationLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationGenerationLevel);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationGenerationLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationGenerationLevel, valuePointer, sizeof(o->maxTessellationGenerationLevel));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationPatchSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationPatchSize);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationPatchSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationPatchSize, valuePointer, sizeof(o->maxTessellationPatchSize));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlPerVertexInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlPerVertexInputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlPerVertexInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlPerVertexInputComponents, valuePointer, sizeof(o->maxTessellationControlPerVertexInputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlPerVertexOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlPerVertexOutputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlPerVertexOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlPerVertexOutputComponents, valuePointer, sizeof(o->maxTessellationControlPerVertexOutputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlPerPatchOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlPerPatchOutputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlPerPatchOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlPerPatchOutputComponents, valuePointer, sizeof(o->maxTessellationControlPerPatchOutputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlTotalOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlTotalOutputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlTotalOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlTotalOutputComponents, valuePointer, sizeof(o->maxTessellationControlTotalOutputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationEvaluationInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationEvaluationInputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationEvaluationInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationEvaluationInputComponents, valuePointer, sizeof(o->maxTessellationEvaluationInputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationEvaluationOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationEvaluationOutputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationEvaluationOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationEvaluationOutputComponents, valuePointer, sizeof(o->maxTessellationEvaluationOutputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryShaderInvocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryShaderInvocations);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryShaderInvocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryShaderInvocations, valuePointer, sizeof(o->maxGeometryShaderInvocations));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryInputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryInputComponents, valuePointer, sizeof(o->maxGeometryInputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryOutputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryOutputComponents, valuePointer, sizeof(o->maxGeometryOutputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryOutputVertices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryOutputVertices);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryOutputVertices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryOutputVertices, valuePointer, sizeof(o->maxGeometryOutputVertices));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryTotalOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryTotalOutputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryTotalOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryTotalOutputComponents, valuePointer, sizeof(o->maxGeometryTotalOutputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentInputComponents);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentInputComponents, valuePointer, sizeof(o->maxFragmentInputComponents));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentOutputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentOutputAttachments);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentOutputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentOutputAttachments, valuePointer, sizeof(o->maxFragmentOutputAttachments));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentDualSrcAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentDualSrcAttachments);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentDualSrcAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentDualSrcAttachments, valuePointer, sizeof(o->maxFragmentDualSrcAttachments));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentCombinedOutputResources(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentCombinedOutputResources);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentCombinedOutputResources(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentCombinedOutputResources, valuePointer, sizeof(o->maxFragmentCombinedOutputResources));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeSharedMemorySize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxComputeSharedMemorySize);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeSharedMemorySize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxComputeSharedMemorySize, valuePointer, sizeof(o->maxComputeSharedMemorySize));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeWorkGroupCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->maxComputeWorkGroupCount);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeWorkGroupCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->maxComputeWorkGroupCount, valuePointer, sizeof(o->maxComputeWorkGroupCount));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeWorkGroupInvocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxComputeWorkGroupInvocations);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeWorkGroupInvocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxComputeWorkGroupInvocations, valuePointer, sizeof(o->maxComputeWorkGroupInvocations));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeWorkGroupSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->maxComputeWorkGroupSize);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeWorkGroupSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->maxComputeWorkGroupSize, valuePointer, sizeof(o->maxComputeWorkGroupSize));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSubPixelPrecisionBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->subPixelPrecisionBits);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSubPixelPrecisionBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subPixelPrecisionBits, valuePointer, sizeof(o->subPixelPrecisionBits));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSubTexelPrecisionBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->subTexelPrecisionBits);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSubTexelPrecisionBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subTexelPrecisionBits, valuePointer, sizeof(o->subTexelPrecisionBits));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMipmapPrecisionBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipmapPrecisionBits);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMipmapPrecisionBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipmapPrecisionBits, valuePointer, sizeof(o->mipmapPrecisionBits));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDrawIndexedIndexValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDrawIndexedIndexValue);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDrawIndexedIndexValue(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDrawIndexedIndexValue, valuePointer, sizeof(o->maxDrawIndexedIndexValue));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDrawIndirectCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDrawIndirectCount);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDrawIndirectCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDrawIndirectCount, valuePointer, sizeof(o->maxDrawIndirectCount));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSamplerLodBias(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSamplerLodBias);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSamplerLodBias(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSamplerLodBias, valuePointer, sizeof(o->maxSamplerLodBias));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSamplerAnisotropy);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSamplerAnisotropy, valuePointer, sizeof(o->maxSamplerAnisotropy));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxViewports(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxViewports);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxViewports(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxViewports, valuePointer, sizeof(o->maxViewports));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxViewportDimensions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->maxViewportDimensions);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxViewportDimensions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->maxViewportDimensions, valuePointer, sizeof(o->maxViewportDimensions));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getViewportBoundsRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->viewportBoundsRange);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setViewportBoundsRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->viewportBoundsRange, valuePointer, sizeof(o->viewportBoundsRange));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getViewportSubPixelBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewportSubPixelBits);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setViewportSubPixelBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewportSubPixelBits, valuePointer, sizeof(o->viewportSubPixelBits));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinMemoryMapAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minMemoryMapAlignment);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinMemoryMapAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minMemoryMapAlignment, valuePointer, sizeof(o->minMemoryMapAlignment));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinTexelBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minTexelBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinTexelBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minTexelBufferOffsetAlignment, valuePointer, sizeof(o->minTexelBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinUniformBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minUniformBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinUniformBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minUniformBufferOffsetAlignment, valuePointer, sizeof(o->minUniformBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinStorageBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minStorageBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinStorageBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minStorageBufferOffsetAlignment, valuePointer, sizeof(o->minStorageBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinTexelOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minTexelOffset);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinTexelOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minTexelOffset, valuePointer, sizeof(o->minTexelOffset));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTexelOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTexelOffset);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTexelOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTexelOffset, valuePointer, sizeof(o->maxTexelOffset));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinTexelGatherOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minTexelGatherOffset);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinTexelGatherOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minTexelGatherOffset, valuePointer, sizeof(o->minTexelGatherOffset));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTexelGatherOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTexelGatherOffset);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTexelGatherOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTexelGatherOffset, valuePointer, sizeof(o->maxTexelGatherOffset));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinInterpolationOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minInterpolationOffset);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinInterpolationOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minInterpolationOffset, valuePointer, sizeof(o->minInterpolationOffset));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxInterpolationOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxInterpolationOffset);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxInterpolationOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxInterpolationOffset, valuePointer, sizeof(o->maxInterpolationOffset));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSubPixelInterpolationOffsetBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->subPixelInterpolationOffsetBits);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSubPixelInterpolationOffsetBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subPixelInterpolationOffsetBits, valuePointer, sizeof(o->subPixelInterpolationOffsetBits));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFramebufferWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFramebufferWidth);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFramebufferWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFramebufferWidth, valuePointer, sizeof(o->maxFramebufferWidth));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFramebufferHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFramebufferHeight);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFramebufferHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFramebufferHeight, valuePointer, sizeof(o->maxFramebufferHeight));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFramebufferLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFramebufferLayers);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFramebufferLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFramebufferLayers, valuePointer, sizeof(o->maxFramebufferLayers));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferColorSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferColorSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferColorSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferColorSampleCounts, valuePointer, sizeof(o->framebufferColorSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferDepthSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferDepthSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferDepthSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferDepthSampleCounts, valuePointer, sizeof(o->framebufferDepthSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferStencilSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferStencilSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferStencilSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferStencilSampleCounts, valuePointer, sizeof(o->framebufferStencilSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferNoAttachmentsSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferNoAttachmentsSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferNoAttachmentsSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferNoAttachmentsSampleCounts, valuePointer, sizeof(o->framebufferNoAttachmentsSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxColorAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxColorAttachments);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxColorAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxColorAttachments, valuePointer, sizeof(o->maxColorAttachments));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageColorSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageColorSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageColorSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageColorSampleCounts, valuePointer, sizeof(o->sampledImageColorSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageIntegerSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageIntegerSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageIntegerSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageIntegerSampleCounts, valuePointer, sizeof(o->sampledImageIntegerSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageDepthSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageDepthSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageDepthSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageDepthSampleCounts, valuePointer, sizeof(o->sampledImageDepthSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageStencilSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageStencilSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageStencilSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageStencilSampleCounts, valuePointer, sizeof(o->sampledImageStencilSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getStorageImageSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->storageImageSampleCounts);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setStorageImageSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storageImageSampleCounts, valuePointer, sizeof(o->storageImageSampleCounts));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSampleMaskWords(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSampleMaskWords);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSampleMaskWords(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSampleMaskWords, valuePointer, sizeof(o->maxSampleMaskWords));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getTimestampComputeAndGraphics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->timestampComputeAndGraphics);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setTimestampComputeAndGraphics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->timestampComputeAndGraphics, valuePointer, sizeof(o->timestampComputeAndGraphics));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getTimestampPeriod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->timestampPeriod);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setTimestampPeriod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->timestampPeriod, valuePointer, sizeof(o->timestampPeriod));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxClipDistances(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxClipDistances);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxClipDistances(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxClipDistances, valuePointer, sizeof(o->maxClipDistances));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxCullDistances(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxCullDistances);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxCullDistances(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxCullDistances, valuePointer, sizeof(o->maxCullDistances));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxCombinedClipAndCullDistances(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxCombinedClipAndCullDistances);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxCombinedClipAndCullDistances(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxCombinedClipAndCullDistances, valuePointer, sizeof(o->maxCombinedClipAndCullDistances));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getDiscreteQueuePriorities(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->discreteQueuePriorities);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setDiscreteQueuePriorities(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->discreteQueuePriorities, valuePointer, sizeof(o->discreteQueuePriorities));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getPointSizeRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->pointSizeRange);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setPointSizeRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->pointSizeRange, valuePointer, sizeof(o->pointSizeRange));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getLineWidthRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->lineWidthRange);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setLineWidthRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->lineWidthRange, valuePointer, sizeof(o->lineWidthRange));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getPointSizeGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->pointSizeGranularity);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setPointSizeGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pointSizeGranularity, valuePointer, sizeof(o->pointSizeGranularity));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getLineWidthGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->lineWidthGranularity);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setLineWidthGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->lineWidthGranularity, valuePointer, sizeof(o->lineWidthGranularity));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getStrictLines(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->strictLines);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setStrictLines(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->strictLines, valuePointer, sizeof(o->strictLines));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getStandardSampleLocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->standardSampleLocations);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setStandardSampleLocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->standardSampleLocations, valuePointer, sizeof(o->standardSampleLocations));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getOptimalBufferCopyOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->optimalBufferCopyOffsetAlignment);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setOptimalBufferCopyOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->optimalBufferCopyOffsetAlignment, valuePointer, sizeof(o->optimalBufferCopyOffsetAlignment));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getOptimalBufferCopyRowPitchAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->optimalBufferCopyRowPitchAlignment);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setOptimalBufferCopyRowPitchAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->optimalBufferCopyRowPitchAlignment, valuePointer, sizeof(o->optimalBufferCopyRowPitchAlignment));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getNonCoherentAtomSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->nonCoherentAtomSize);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setNonCoherentAtomSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->nonCoherentAtomSize, valuePointer, sizeof(o->nonCoherentAtomSize));
}


