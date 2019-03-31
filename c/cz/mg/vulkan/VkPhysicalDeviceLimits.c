#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
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
    return jniPointerToLong(&(o->maxImageDimension1D));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimension1D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxImageDimension1D, jniLongToPointer(valueAddress), sizeof(o->maxImageDimension1D));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageDimension2D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxImageDimension2D));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimension2D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxImageDimension2D, jniLongToPointer(valueAddress), sizeof(o->maxImageDimension2D));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageDimension3D(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxImageDimension3D));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimension3D(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxImageDimension3D, jniLongToPointer(valueAddress), sizeof(o->maxImageDimension3D));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageDimensionCube(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxImageDimensionCube));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageDimensionCube(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxImageDimensionCube, jniLongToPointer(valueAddress), sizeof(o->maxImageDimensionCube));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxImageArrayLayers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxImageArrayLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxImageArrayLayers, jniLongToPointer(valueAddress), sizeof(o->maxImageArrayLayers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTexelBufferElements(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTexelBufferElements));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTexelBufferElements(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTexelBufferElements, jniLongToPointer(valueAddress), sizeof(o->maxTexelBufferElements));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxUniformBufferRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxUniformBufferRange));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxUniformBufferRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxUniformBufferRange, jniLongToPointer(valueAddress), sizeof(o->maxUniformBufferRange));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxStorageBufferRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxStorageBufferRange));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxStorageBufferRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxStorageBufferRange, jniLongToPointer(valueAddress), sizeof(o->maxStorageBufferRange));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPushConstantsSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPushConstantsSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPushConstantsSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPushConstantsSize, jniLongToPointer(valueAddress), sizeof(o->maxPushConstantsSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxMemoryAllocationCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxMemoryAllocationCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxMemoryAllocationCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxMemoryAllocationCount, jniLongToPointer(valueAddress), sizeof(o->maxMemoryAllocationCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSamplerAllocationCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSamplerAllocationCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSamplerAllocationCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxSamplerAllocationCount, jniLongToPointer(valueAddress), sizeof(o->maxSamplerAllocationCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getBufferImageGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->bufferImageGranularity));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setBufferImageGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->bufferImageGranularity, jniLongToPointer(valueAddress), sizeof(o->bufferImageGranularity));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSparseAddressSpaceSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sparseAddressSpaceSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSparseAddressSpaceSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->sparseAddressSpaceSize, jniLongToPointer(valueAddress), sizeof(o->sparseAddressSpaceSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxBoundDescriptorSets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxBoundDescriptorSets));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxBoundDescriptorSets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxBoundDescriptorSets, jniLongToPointer(valueAddress), sizeof(o->maxBoundDescriptorSets));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorSamplers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorSamplers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorSamplers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorSamplers, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorSamplers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorUniformBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorUniformBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorUniformBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorUniformBuffers, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorUniformBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorStorageBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorStorageBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorStorageBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorStorageBuffers, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorStorageBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorSampledImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorSampledImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorSampledImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorSampledImages, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorSampledImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorStorageImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorStorageImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorStorageImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorStorageImages, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorStorageImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageDescriptorInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorInputAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageDescriptorInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorInputAttachments, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorInputAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxPerStageResources(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageResources));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxPerStageResources(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxPerStageResources, jniLongToPointer(valueAddress), sizeof(o->maxPerStageResources));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetSamplers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetSamplers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetSamplers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetSamplers, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetSamplers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetUniformBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUniformBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetUniformBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUniformBuffers, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUniformBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetUniformBuffersDynamic(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUniformBuffersDynamic));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetUniformBuffersDynamic(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUniformBuffersDynamic, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUniformBuffersDynamic));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetStorageBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetStorageBuffers, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetStorageBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageBuffersDynamic(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetStorageBuffersDynamic));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageBuffersDynamic(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetStorageBuffersDynamic, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetStorageBuffersDynamic));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetSampledImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetSampledImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetSampledImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetSampledImages, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetSampledImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetStorageImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetStorageImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetStorageImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetStorageImages, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetStorageImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDescriptorSetInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetInputAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDescriptorSetInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetInputAttachments, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetInputAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputAttributes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxVertexInputAttributes));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputAttributes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxVertexInputAttributes, jniLongToPointer(valueAddress), sizeof(o->maxVertexInputAttributes));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputBindings(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxVertexInputBindings));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputBindings(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxVertexInputBindings, jniLongToPointer(valueAddress), sizeof(o->maxVertexInputBindings));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputAttributeOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxVertexInputAttributeOffset));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputAttributeOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxVertexInputAttributeOffset, jniLongToPointer(valueAddress), sizeof(o->maxVertexInputAttributeOffset));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexInputBindingStride(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxVertexInputBindingStride));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexInputBindingStride(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxVertexInputBindingStride, jniLongToPointer(valueAddress), sizeof(o->maxVertexInputBindingStride));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxVertexOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxVertexOutputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxVertexOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxVertexOutputComponents, jniLongToPointer(valueAddress), sizeof(o->maxVertexOutputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationGenerationLevel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationGenerationLevel));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationGenerationLevel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationGenerationLevel, jniLongToPointer(valueAddress), sizeof(o->maxTessellationGenerationLevel));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationPatchSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationPatchSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationPatchSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationPatchSize, jniLongToPointer(valueAddress), sizeof(o->maxTessellationPatchSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlPerVertexInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationControlPerVertexInputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlPerVertexInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationControlPerVertexInputComponents, jniLongToPointer(valueAddress), sizeof(o->maxTessellationControlPerVertexInputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlPerVertexOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationControlPerVertexOutputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlPerVertexOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationControlPerVertexOutputComponents, jniLongToPointer(valueAddress), sizeof(o->maxTessellationControlPerVertexOutputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlPerPatchOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationControlPerPatchOutputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlPerPatchOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationControlPerPatchOutputComponents, jniLongToPointer(valueAddress), sizeof(o->maxTessellationControlPerPatchOutputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationControlTotalOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationControlTotalOutputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationControlTotalOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationControlTotalOutputComponents, jniLongToPointer(valueAddress), sizeof(o->maxTessellationControlTotalOutputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationEvaluationInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationEvaluationInputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationEvaluationInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationEvaluationInputComponents, jniLongToPointer(valueAddress), sizeof(o->maxTessellationEvaluationInputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTessellationEvaluationOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTessellationEvaluationOutputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTessellationEvaluationOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTessellationEvaluationOutputComponents, jniLongToPointer(valueAddress), sizeof(o->maxTessellationEvaluationOutputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryShaderInvocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxGeometryShaderInvocations));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryShaderInvocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxGeometryShaderInvocations, jniLongToPointer(valueAddress), sizeof(o->maxGeometryShaderInvocations));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxGeometryInputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxGeometryInputComponents, jniLongToPointer(valueAddress), sizeof(o->maxGeometryInputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxGeometryOutputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxGeometryOutputComponents, jniLongToPointer(valueAddress), sizeof(o->maxGeometryOutputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryOutputVertices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxGeometryOutputVertices));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryOutputVertices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxGeometryOutputVertices, jniLongToPointer(valueAddress), sizeof(o->maxGeometryOutputVertices));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxGeometryTotalOutputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxGeometryTotalOutputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxGeometryTotalOutputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxGeometryTotalOutputComponents, jniLongToPointer(valueAddress), sizeof(o->maxGeometryTotalOutputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentInputComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFragmentInputComponents));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentInputComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxFragmentInputComponents, jniLongToPointer(valueAddress), sizeof(o->maxFragmentInputComponents));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentOutputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFragmentOutputAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentOutputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxFragmentOutputAttachments, jniLongToPointer(valueAddress), sizeof(o->maxFragmentOutputAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentDualSrcAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFragmentDualSrcAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentDualSrcAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxFragmentDualSrcAttachments, jniLongToPointer(valueAddress), sizeof(o->maxFragmentDualSrcAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFragmentCombinedOutputResources(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFragmentCombinedOutputResources));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFragmentCombinedOutputResources(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxFragmentCombinedOutputResources, jniLongToPointer(valueAddress), sizeof(o->maxFragmentCombinedOutputResources));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeSharedMemorySize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxComputeSharedMemorySize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeSharedMemorySize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxComputeSharedMemorySize, jniLongToPointer(valueAddress), sizeof(o->maxComputeSharedMemorySize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeWorkGroupCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxComputeWorkGroupCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeWorkGroupCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(o->maxComputeWorkGroupCount, jniLongToPointer(valueAddress), sizeof(o->maxComputeWorkGroupCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeWorkGroupInvocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxComputeWorkGroupInvocations));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeWorkGroupInvocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxComputeWorkGroupInvocations, jniLongToPointer(valueAddress), sizeof(o->maxComputeWorkGroupInvocations));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxComputeWorkGroupSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxComputeWorkGroupSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxComputeWorkGroupSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(o->maxComputeWorkGroupSize, jniLongToPointer(valueAddress), sizeof(o->maxComputeWorkGroupSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSubPixelPrecisionBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->subPixelPrecisionBits));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSubPixelPrecisionBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->subPixelPrecisionBits, jniLongToPointer(valueAddress), sizeof(o->subPixelPrecisionBits));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSubTexelPrecisionBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->subTexelPrecisionBits));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSubTexelPrecisionBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->subTexelPrecisionBits, jniLongToPointer(valueAddress), sizeof(o->subTexelPrecisionBits));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMipmapPrecisionBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->mipmapPrecisionBits));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMipmapPrecisionBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->mipmapPrecisionBits, jniLongToPointer(valueAddress), sizeof(o->mipmapPrecisionBits));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDrawIndexedIndexValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDrawIndexedIndexValue));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDrawIndexedIndexValue(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDrawIndexedIndexValue, jniLongToPointer(valueAddress), sizeof(o->maxDrawIndexedIndexValue));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxDrawIndirectCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDrawIndirectCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxDrawIndirectCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxDrawIndirectCount, jniLongToPointer(valueAddress), sizeof(o->maxDrawIndirectCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSamplerLodBias(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSamplerLodBias));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSamplerLodBias(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxSamplerLodBias, jniLongToPointer(valueAddress), sizeof(o->maxSamplerLodBias));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSamplerAnisotropy));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSamplerAnisotropy(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxSamplerAnisotropy, jniLongToPointer(valueAddress), sizeof(o->maxSamplerAnisotropy));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxViewports(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxViewports));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxViewports(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxViewports, jniLongToPointer(valueAddress), sizeof(o->maxViewports));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxViewportDimensions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxViewportDimensions));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxViewportDimensions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(o->maxViewportDimensions, jniLongToPointer(valueAddress), sizeof(o->maxViewportDimensions));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getViewportBoundsRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->viewportBoundsRange));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setViewportBoundsRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(o->viewportBoundsRange, jniLongToPointer(valueAddress), sizeof(o->viewportBoundsRange));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getViewportSubPixelBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->viewportSubPixelBits));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setViewportSubPixelBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->viewportSubPixelBits, jniLongToPointer(valueAddress), sizeof(o->viewportSubPixelBits));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinMemoryMapAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minMemoryMapAlignment));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinMemoryMapAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->minMemoryMapAlignment, jniLongToPointer(valueAddress), sizeof(o->minMemoryMapAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinTexelBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minTexelBufferOffsetAlignment));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinTexelBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->minTexelBufferOffsetAlignment, jniLongToPointer(valueAddress), sizeof(o->minTexelBufferOffsetAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinUniformBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minUniformBufferOffsetAlignment));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinUniformBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->minUniformBufferOffsetAlignment, jniLongToPointer(valueAddress), sizeof(o->minUniformBufferOffsetAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinStorageBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minStorageBufferOffsetAlignment));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinStorageBufferOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->minStorageBufferOffsetAlignment, jniLongToPointer(valueAddress), sizeof(o->minStorageBufferOffsetAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinTexelOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minTexelOffset));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinTexelOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->minTexelOffset, jniLongToPointer(valueAddress), sizeof(o->minTexelOffset));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTexelOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTexelOffset));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTexelOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTexelOffset, jniLongToPointer(valueAddress), sizeof(o->maxTexelOffset));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinTexelGatherOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minTexelGatherOffset));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinTexelGatherOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->minTexelGatherOffset, jniLongToPointer(valueAddress), sizeof(o->minTexelGatherOffset));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxTexelGatherOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxTexelGatherOffset));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxTexelGatherOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxTexelGatherOffset, jniLongToPointer(valueAddress), sizeof(o->maxTexelGatherOffset));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMinInterpolationOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minInterpolationOffset));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMinInterpolationOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->minInterpolationOffset, jniLongToPointer(valueAddress), sizeof(o->minInterpolationOffset));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxInterpolationOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxInterpolationOffset));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxInterpolationOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxInterpolationOffset, jniLongToPointer(valueAddress), sizeof(o->maxInterpolationOffset));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSubPixelInterpolationOffsetBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->subPixelInterpolationOffsetBits));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSubPixelInterpolationOffsetBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->subPixelInterpolationOffsetBits, jniLongToPointer(valueAddress), sizeof(o->subPixelInterpolationOffsetBits));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFramebufferWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFramebufferWidth));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFramebufferWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxFramebufferWidth, jniLongToPointer(valueAddress), sizeof(o->maxFramebufferWidth));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFramebufferHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFramebufferHeight));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFramebufferHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxFramebufferHeight, jniLongToPointer(valueAddress), sizeof(o->maxFramebufferHeight));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxFramebufferLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxFramebufferLayers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxFramebufferLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxFramebufferLayers, jniLongToPointer(valueAddress), sizeof(o->maxFramebufferLayers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferColorSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->framebufferColorSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferColorSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->framebufferColorSampleCounts, jniLongToPointer(valueAddress), sizeof(o->framebufferColorSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferDepthSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->framebufferDepthSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferDepthSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->framebufferDepthSampleCounts, jniLongToPointer(valueAddress), sizeof(o->framebufferDepthSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferStencilSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->framebufferStencilSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferStencilSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->framebufferStencilSampleCounts, jniLongToPointer(valueAddress), sizeof(o->framebufferStencilSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getFramebufferNoAttachmentsSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->framebufferNoAttachmentsSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setFramebufferNoAttachmentsSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->framebufferNoAttachmentsSampleCounts, jniLongToPointer(valueAddress), sizeof(o->framebufferNoAttachmentsSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxColorAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxColorAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxColorAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxColorAttachments, jniLongToPointer(valueAddress), sizeof(o->maxColorAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageColorSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampledImageColorSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageColorSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->sampledImageColorSampleCounts, jniLongToPointer(valueAddress), sizeof(o->sampledImageColorSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageIntegerSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampledImageIntegerSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageIntegerSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->sampledImageIntegerSampleCounts, jniLongToPointer(valueAddress), sizeof(o->sampledImageIntegerSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageDepthSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampledImageDepthSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageDepthSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->sampledImageDepthSampleCounts, jniLongToPointer(valueAddress), sizeof(o->sampledImageDepthSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getSampledImageStencilSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampledImageStencilSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setSampledImageStencilSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->sampledImageStencilSampleCounts, jniLongToPointer(valueAddress), sizeof(o->sampledImageStencilSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getStorageImageSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->storageImageSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setStorageImageSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->storageImageSampleCounts, jniLongToPointer(valueAddress), sizeof(o->storageImageSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxSampleMaskWords(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSampleMaskWords));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxSampleMaskWords(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxSampleMaskWords, jniLongToPointer(valueAddress), sizeof(o->maxSampleMaskWords));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getTimestampComputeAndGraphics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->timestampComputeAndGraphics));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setTimestampComputeAndGraphics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->timestampComputeAndGraphics, jniLongToPointer(valueAddress), sizeof(o->timestampComputeAndGraphics));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getTimestampPeriod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->timestampPeriod));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setTimestampPeriod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->timestampPeriod, jniLongToPointer(valueAddress), sizeof(o->timestampPeriod));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxClipDistances(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxClipDistances));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxClipDistances(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxClipDistances, jniLongToPointer(valueAddress), sizeof(o->maxClipDistances));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxCullDistances(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxCullDistances));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxCullDistances(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxCullDistances, jniLongToPointer(valueAddress), sizeof(o->maxCullDistances));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getMaxCombinedClipAndCullDistances(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxCombinedClipAndCullDistances));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setMaxCombinedClipAndCullDistances(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->maxCombinedClipAndCullDistances, jniLongToPointer(valueAddress), sizeof(o->maxCombinedClipAndCullDistances));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getDiscreteQueuePriorities(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->discreteQueuePriorities));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setDiscreteQueuePriorities(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->discreteQueuePriorities, jniLongToPointer(valueAddress), sizeof(o->discreteQueuePriorities));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getPointSizeRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pointSizeRange));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setPointSizeRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(o->pointSizeRange, jniLongToPointer(valueAddress), sizeof(o->pointSizeRange));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getLineWidthRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->lineWidthRange));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setLineWidthRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(o->lineWidthRange, jniLongToPointer(valueAddress), sizeof(o->lineWidthRange));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getPointSizeGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pointSizeGranularity));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setPointSizeGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->pointSizeGranularity, jniLongToPointer(valueAddress), sizeof(o->pointSizeGranularity));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getLineWidthGranularity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->lineWidthGranularity));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setLineWidthGranularity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->lineWidthGranularity, jniLongToPointer(valueAddress), sizeof(o->lineWidthGranularity));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getStrictLines(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->strictLines));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setStrictLines(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->strictLines, jniLongToPointer(valueAddress), sizeof(o->strictLines));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getStandardSampleLocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->standardSampleLocations));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setStandardSampleLocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->standardSampleLocations, jniLongToPointer(valueAddress), sizeof(o->standardSampleLocations));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getOptimalBufferCopyOffsetAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->optimalBufferCopyOffsetAlignment));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setOptimalBufferCopyOffsetAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->optimalBufferCopyOffsetAlignment, jniLongToPointer(valueAddress), sizeof(o->optimalBufferCopyOffsetAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getOptimalBufferCopyRowPitchAlignment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->optimalBufferCopyRowPitchAlignment));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setOptimalBufferCopyRowPitchAlignment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->optimalBufferCopyRowPitchAlignment, jniLongToPointer(valueAddress), sizeof(o->optimalBufferCopyRowPitchAlignment));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_getNonCoherentAtomSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    return jniPointerToLong(&(o->nonCoherentAtomSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceLimits_setNonCoherentAtomSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceLimits* o = (VkPhysicalDeviceLimits*)jniLongToPointer(address);
    memcpy(&o->nonCoherentAtomSize, jniLongToPointer(valueAddress), sizeof(o->nonCoherentAtomSize));
}

