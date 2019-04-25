#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceLimits);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxImageDimension1DNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimension1D);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxImageDimension1DNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimension1D, valuePointer, sizeof(o->maxImageDimension1D));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxImageDimension2DNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimension2D);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxImageDimension2DNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimension2D, valuePointer, sizeof(o->maxImageDimension2D));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxImageDimension3DNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimension3D);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxImageDimension3DNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimension3D, valuePointer, sizeof(o->maxImageDimension3D));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxImageDimensionCubeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageDimensionCube);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxImageDimensionCubeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageDimensionCube, valuePointer, sizeof(o->maxImageDimensionCube));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxImageArrayLayers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxImageArrayLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxImageArrayLayers, valuePointer, sizeof(o->maxImageArrayLayers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTexelBufferElementsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTexelBufferElements);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTexelBufferElementsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTexelBufferElements, valuePointer, sizeof(o->maxTexelBufferElements));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxUniformBufferRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxUniformBufferRange);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxUniformBufferRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxUniformBufferRange, valuePointer, sizeof(o->maxUniformBufferRange));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxStorageBufferRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxStorageBufferRange);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxStorageBufferRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxStorageBufferRange, valuePointer, sizeof(o->maxStorageBufferRange));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPushConstantsSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPushConstantsSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPushConstantsSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPushConstantsSize, valuePointer, sizeof(o->maxPushConstantsSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxMemoryAllocationCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxMemoryAllocationCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxMemoryAllocationCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxMemoryAllocationCount, valuePointer, sizeof(o->maxMemoryAllocationCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxSamplerAllocationCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSamplerAllocationCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxSamplerAllocationCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSamplerAllocationCount, valuePointer, sizeof(o->maxSamplerAllocationCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getBufferImageGranularityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferImageGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setBufferImageGranularityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferImageGranularity, valuePointer, sizeof(o->bufferImageGranularity));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSparseAddressSpaceSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sparseAddressSpaceSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSparseAddressSpaceSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sparseAddressSpaceSize, valuePointer, sizeof(o->sparseAddressSpaceSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxBoundDescriptorSetsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxBoundDescriptorSets);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxBoundDescriptorSetsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxBoundDescriptorSets, valuePointer, sizeof(o->maxBoundDescriptorSets));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPerStageDescriptorSamplersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorSamplers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPerStageDescriptorSamplersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorSamplers, valuePointer, sizeof(o->maxPerStageDescriptorSamplers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPerStageDescriptorUniformBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUniformBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPerStageDescriptorUniformBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUniformBuffers, valuePointer, sizeof(o->maxPerStageDescriptorUniformBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPerStageDescriptorStorageBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorStorageBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPerStageDescriptorStorageBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorStorageBuffers, valuePointer, sizeof(o->maxPerStageDescriptorStorageBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPerStageDescriptorSampledImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorSampledImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPerStageDescriptorSampledImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorSampledImages, valuePointer, sizeof(o->maxPerStageDescriptorSampledImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPerStageDescriptorStorageImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorStorageImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPerStageDescriptorStorageImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorStorageImages, valuePointer, sizeof(o->maxPerStageDescriptorStorageImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPerStageDescriptorInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorInputAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPerStageDescriptorInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorInputAttachments, valuePointer, sizeof(o->maxPerStageDescriptorInputAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxPerStageResourcesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageResources);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxPerStageResourcesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageResources, valuePointer, sizeof(o->maxPerStageResources));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetSamplersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetSamplers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetSamplersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetSamplers, valuePointer, sizeof(o->maxDescriptorSetSamplers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetUniformBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUniformBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetUniformBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUniformBuffers, valuePointer, sizeof(o->maxDescriptorSetUniformBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetUniformBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUniformBuffersDynamic);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetUniformBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUniformBuffersDynamic, valuePointer, sizeof(o->maxDescriptorSetUniformBuffersDynamic));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetStorageBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetStorageBuffers, valuePointer, sizeof(o->maxDescriptorSetStorageBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetStorageBuffersDynamic);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetStorageBuffersDynamic, valuePointer, sizeof(o->maxDescriptorSetStorageBuffersDynamic));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetSampledImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetSampledImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetSampledImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetSampledImages, valuePointer, sizeof(o->maxDescriptorSetSampledImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetStorageImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetStorageImages, valuePointer, sizeof(o->maxDescriptorSetStorageImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDescriptorSetInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetInputAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDescriptorSetInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetInputAttachments, valuePointer, sizeof(o->maxDescriptorSetInputAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxVertexInputAttributesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputAttributes);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxVertexInputAttributesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputAttributes, valuePointer, sizeof(o->maxVertexInputAttributes));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxVertexInputBindingsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputBindings);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxVertexInputBindingsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputBindings, valuePointer, sizeof(o->maxVertexInputBindings));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxVertexInputAttributeOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputAttributeOffset);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxVertexInputAttributeOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputAttributeOffset, valuePointer, sizeof(o->maxVertexInputAttributeOffset));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxVertexInputBindingStrideNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexInputBindingStride);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxVertexInputBindingStrideNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexInputBindingStride, valuePointer, sizeof(o->maxVertexInputBindingStride));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxVertexOutputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexOutputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxVertexOutputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexOutputComponents, valuePointer, sizeof(o->maxVertexOutputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationGenerationLevelNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationGenerationLevel);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationGenerationLevelNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationGenerationLevel, valuePointer, sizeof(o->maxTessellationGenerationLevel));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationPatchSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationPatchSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationPatchSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationPatchSize, valuePointer, sizeof(o->maxTessellationPatchSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationControlPerVertexInputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlPerVertexInputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationControlPerVertexInputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlPerVertexInputComponents, valuePointer, sizeof(o->maxTessellationControlPerVertexInputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationControlPerVertexOutputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlPerVertexOutputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationControlPerVertexOutputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlPerVertexOutputComponents, valuePointer, sizeof(o->maxTessellationControlPerVertexOutputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationControlPerPatchOutputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlPerPatchOutputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationControlPerPatchOutputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlPerPatchOutputComponents, valuePointer, sizeof(o->maxTessellationControlPerPatchOutputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationControlTotalOutputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationControlTotalOutputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationControlTotalOutputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationControlTotalOutputComponents, valuePointer, sizeof(o->maxTessellationControlTotalOutputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationEvaluationInputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationEvaluationInputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationEvaluationInputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationEvaluationInputComponents, valuePointer, sizeof(o->maxTessellationEvaluationInputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTessellationEvaluationOutputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTessellationEvaluationOutputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTessellationEvaluationOutputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTessellationEvaluationOutputComponents, valuePointer, sizeof(o->maxTessellationEvaluationOutputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxGeometryShaderInvocationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryShaderInvocations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxGeometryShaderInvocationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryShaderInvocations, valuePointer, sizeof(o->maxGeometryShaderInvocations));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxGeometryInputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryInputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxGeometryInputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryInputComponents, valuePointer, sizeof(o->maxGeometryInputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxGeometryOutputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryOutputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxGeometryOutputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryOutputComponents, valuePointer, sizeof(o->maxGeometryOutputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxGeometryOutputVerticesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryOutputVertices);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxGeometryOutputVerticesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryOutputVertices, valuePointer, sizeof(o->maxGeometryOutputVertices));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxGeometryTotalOutputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxGeometryTotalOutputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxGeometryTotalOutputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxGeometryTotalOutputComponents, valuePointer, sizeof(o->maxGeometryTotalOutputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxFragmentInputComponentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentInputComponents);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxFragmentInputComponentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentInputComponents, valuePointer, sizeof(o->maxFragmentInputComponents));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxFragmentOutputAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentOutputAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxFragmentOutputAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentOutputAttachments, valuePointer, sizeof(o->maxFragmentOutputAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxFragmentDualSrcAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentDualSrcAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxFragmentDualSrcAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentDualSrcAttachments, valuePointer, sizeof(o->maxFragmentDualSrcAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxFragmentCombinedOutputResourcesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFragmentCombinedOutputResources);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxFragmentCombinedOutputResourcesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFragmentCombinedOutputResources, valuePointer, sizeof(o->maxFragmentCombinedOutputResources));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxComputeSharedMemorySizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxComputeSharedMemorySize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxComputeSharedMemorySizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxComputeSharedMemorySize, valuePointer, sizeof(o->maxComputeSharedMemorySize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxComputeWorkGroupCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->maxComputeWorkGroupCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxComputeWorkGroupCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->maxComputeWorkGroupCount, valuePointer, sizeof(o->maxComputeWorkGroupCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxComputeWorkGroupInvocationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxComputeWorkGroupInvocations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxComputeWorkGroupInvocationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxComputeWorkGroupInvocations, valuePointer, sizeof(o->maxComputeWorkGroupInvocations));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxComputeWorkGroupSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->maxComputeWorkGroupSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxComputeWorkGroupSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->maxComputeWorkGroupSize, valuePointer, sizeof(o->maxComputeWorkGroupSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSubPixelPrecisionBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->subPixelPrecisionBits);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSubPixelPrecisionBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subPixelPrecisionBits, valuePointer, sizeof(o->subPixelPrecisionBits));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSubTexelPrecisionBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->subTexelPrecisionBits);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSubTexelPrecisionBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subTexelPrecisionBits, valuePointer, sizeof(o->subTexelPrecisionBits));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMipmapPrecisionBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->mipmapPrecisionBits);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMipmapPrecisionBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->mipmapPrecisionBits, valuePointer, sizeof(o->mipmapPrecisionBits));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDrawIndexedIndexValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDrawIndexedIndexValue);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDrawIndexedIndexValueNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDrawIndexedIndexValue, valuePointer, sizeof(o->maxDrawIndexedIndexValue));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxDrawIndirectCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDrawIndirectCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxDrawIndirectCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDrawIndirectCount, valuePointer, sizeof(o->maxDrawIndirectCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxSamplerLodBiasNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSamplerLodBias);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxSamplerLodBiasNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSamplerLodBias, valuePointer, sizeof(o->maxSamplerLodBias));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxSamplerAnisotropyNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSamplerAnisotropy);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxSamplerAnisotropyNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSamplerAnisotropy, valuePointer, sizeof(o->maxSamplerAnisotropy));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxViewportsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxViewports);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxViewportsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxViewports, valuePointer, sizeof(o->maxViewports));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxViewportDimensionsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->maxViewportDimensions);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxViewportDimensionsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->maxViewportDimensions, valuePointer, sizeof(o->maxViewportDimensions));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getViewportBoundsRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->viewportBoundsRange);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setViewportBoundsRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->viewportBoundsRange, valuePointer, sizeof(o->viewportBoundsRange));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getViewportSubPixelBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewportSubPixelBits);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setViewportSubPixelBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewportSubPixelBits, valuePointer, sizeof(o->viewportSubPixelBits));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMinMemoryMapAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minMemoryMapAlignment);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMinMemoryMapAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minMemoryMapAlignment, valuePointer, sizeof(o->minMemoryMapAlignment));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMinTexelBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minTexelBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMinTexelBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minTexelBufferOffsetAlignment, valuePointer, sizeof(o->minTexelBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMinUniformBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minUniformBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMinUniformBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minUniformBufferOffsetAlignment, valuePointer, sizeof(o->minUniformBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMinStorageBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minStorageBufferOffsetAlignment);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMinStorageBufferOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minStorageBufferOffsetAlignment, valuePointer, sizeof(o->minStorageBufferOffsetAlignment));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMinTexelOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minTexelOffset);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMinTexelOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minTexelOffset, valuePointer, sizeof(o->minTexelOffset));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTexelOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTexelOffset);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTexelOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTexelOffset, valuePointer, sizeof(o->maxTexelOffset));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMinTexelGatherOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minTexelGatherOffset);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMinTexelGatherOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minTexelGatherOffset, valuePointer, sizeof(o->minTexelGatherOffset));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxTexelGatherOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxTexelGatherOffset);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxTexelGatherOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxTexelGatherOffset, valuePointer, sizeof(o->maxTexelGatherOffset));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMinInterpolationOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->minInterpolationOffset);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMinInterpolationOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minInterpolationOffset, valuePointer, sizeof(o->minInterpolationOffset));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxInterpolationOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxInterpolationOffset);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxInterpolationOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxInterpolationOffset, valuePointer, sizeof(o->maxInterpolationOffset));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSubPixelInterpolationOffsetBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->subPixelInterpolationOffsetBits);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSubPixelInterpolationOffsetBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subPixelInterpolationOffsetBits, valuePointer, sizeof(o->subPixelInterpolationOffsetBits));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxFramebufferWidthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFramebufferWidth);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxFramebufferWidthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFramebufferWidth, valuePointer, sizeof(o->maxFramebufferWidth));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxFramebufferHeightNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFramebufferHeight);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxFramebufferHeightNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFramebufferHeight, valuePointer, sizeof(o->maxFramebufferHeight));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxFramebufferLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxFramebufferLayers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxFramebufferLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxFramebufferLayers, valuePointer, sizeof(o->maxFramebufferLayers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getFramebufferColorSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferColorSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setFramebufferColorSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferColorSampleCounts, valuePointer, sizeof(o->framebufferColorSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getFramebufferDepthSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferDepthSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setFramebufferDepthSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferDepthSampleCounts, valuePointer, sizeof(o->framebufferDepthSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getFramebufferStencilSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferStencilSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setFramebufferStencilSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferStencilSampleCounts, valuePointer, sizeof(o->framebufferStencilSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getFramebufferNoAttachmentsSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebufferNoAttachmentsSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setFramebufferNoAttachmentsSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebufferNoAttachmentsSampleCounts, valuePointer, sizeof(o->framebufferNoAttachmentsSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxColorAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxColorAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxColorAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxColorAttachments, valuePointer, sizeof(o->maxColorAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSampledImageColorSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageColorSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSampledImageColorSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageColorSampleCounts, valuePointer, sizeof(o->sampledImageColorSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSampledImageIntegerSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageIntegerSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSampledImageIntegerSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageIntegerSampleCounts, valuePointer, sizeof(o->sampledImageIntegerSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSampledImageDepthSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageDepthSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSampledImageDepthSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageDepthSampleCounts, valuePointer, sizeof(o->sampledImageDepthSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getSampledImageStencilSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampledImageStencilSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setSampledImageStencilSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampledImageStencilSampleCounts, valuePointer, sizeof(o->sampledImageStencilSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getStorageImageSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->storageImageSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setStorageImageSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storageImageSampleCounts, valuePointer, sizeof(o->storageImageSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxSampleMaskWordsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSampleMaskWords);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxSampleMaskWordsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSampleMaskWords, valuePointer, sizeof(o->maxSampleMaskWords));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getTimestampComputeAndGraphicsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->timestampComputeAndGraphics);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setTimestampComputeAndGraphicsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->timestampComputeAndGraphics, valuePointer, sizeof(o->timestampComputeAndGraphics));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getTimestampPeriodNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->timestampPeriod);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setTimestampPeriodNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->timestampPeriod, valuePointer, sizeof(o->timestampPeriod));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxClipDistancesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxClipDistances);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxClipDistancesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxClipDistances, valuePointer, sizeof(o->maxClipDistances));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxCullDistancesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxCullDistances);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxCullDistancesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxCullDistances, valuePointer, sizeof(o->maxCullDistances));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getMaxCombinedClipAndCullDistancesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxCombinedClipAndCullDistances);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setMaxCombinedClipAndCullDistancesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxCombinedClipAndCullDistances, valuePointer, sizeof(o->maxCombinedClipAndCullDistances));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getDiscreteQueuePrioritiesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->discreteQueuePriorities);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setDiscreteQueuePrioritiesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->discreteQueuePriorities, valuePointer, sizeof(o->discreteQueuePriorities));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getPointSizeRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->pointSizeRange);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setPointSizeRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->pointSizeRange, valuePointer, sizeof(o->pointSizeRange));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getLineWidthRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(o->lineWidthRange);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setLineWidthRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->lineWidthRange, valuePointer, sizeof(o->lineWidthRange));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getPointSizeGranularityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->pointSizeGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setPointSizeGranularityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pointSizeGranularity, valuePointer, sizeof(o->pointSizeGranularity));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getLineWidthGranularityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->lineWidthGranularity);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setLineWidthGranularityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->lineWidthGranularity, valuePointer, sizeof(o->lineWidthGranularity));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getStrictLinesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->strictLines);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setStrictLinesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->strictLines, valuePointer, sizeof(o->strictLines));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getStandardSampleLocationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->standardSampleLocations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setStandardSampleLocationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->standardSampleLocations, valuePointer, sizeof(o->standardSampleLocations));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getOptimalBufferCopyOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->optimalBufferCopyOffsetAlignment);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setOptimalBufferCopyOffsetAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->optimalBufferCopyOffsetAlignment, valuePointer, sizeof(o->optimalBufferCopyOffsetAlignment));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getOptimalBufferCopyRowPitchAlignmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->optimalBufferCopyRowPitchAlignment);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setOptimalBufferCopyRowPitchAlignmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->optimalBufferCopyRowPitchAlignment, valuePointer, sizeof(o->optimalBufferCopyRowPitchAlignment));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceLimits_getNonCoherentAtomSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&o->nonCoherentAtomSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceLimits_setNonCoherentAtomSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->nonCoherentAtomSize, valuePointer, sizeof(o->nonCoherentAtomSize));
}


