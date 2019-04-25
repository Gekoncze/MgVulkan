#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceDescriptorIndexingPropertiesEXT);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxUpdateAfterBindDescriptorsInAllPoolsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxUpdateAfterBindDescriptorsInAllPools);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxUpdateAfterBindDescriptorsInAllPoolsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxUpdateAfterBindDescriptorsInAllPools, valuePointer, sizeof(o->maxUpdateAfterBindDescriptorsInAllPools));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderUniformBufferArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderUniformBufferArrayNonUniformIndexingNative);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderUniformBufferArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderUniformBufferArrayNonUniformIndexingNative, valuePointer, sizeof(o->shaderUniformBufferArrayNonUniformIndexingNative));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderSampledImageArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderSampledImageArrayNonUniformIndexingNative);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderSampledImageArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderSampledImageArrayNonUniformIndexingNative, valuePointer, sizeof(o->shaderSampledImageArrayNonUniformIndexingNative));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderStorageBufferArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageBufferArrayNonUniformIndexingNative);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderStorageBufferArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageBufferArrayNonUniformIndexingNative, valuePointer, sizeof(o->shaderStorageBufferArrayNonUniformIndexingNative));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderStorageImageArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageArrayNonUniformIndexingNative);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderStorageImageArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageArrayNonUniformIndexingNative, valuePointer, sizeof(o->shaderStorageImageArrayNonUniformIndexingNative));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderInputAttachmentArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderInputAttachmentArrayNonUniformIndexingNative);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderInputAttachmentArrayNonUniformIndexingNativeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderInputAttachmentArrayNonUniformIndexingNative, valuePointer, sizeof(o->shaderInputAttachmentArrayNonUniformIndexingNative));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getRobustBufferAccessUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->robustBufferAccessUpdateAfterBind);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setRobustBufferAccessUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->robustBufferAccessUpdateAfterBind, valuePointer, sizeof(o->robustBufferAccessUpdateAfterBind));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getQuadDivergentImplicitLodNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->quadDivergentImplicitLod);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setQuadDivergentImplicitLodNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->quadDivergentImplicitLod, valuePointer, sizeof(o->quadDivergentImplicitLod));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindSamplersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUpdateAfterBindSamplers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindSamplersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindSamplers, valuePointer, sizeof(o->maxPerStageDescriptorUpdateAfterBindSamplers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindUniformBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUpdateAfterBindUniformBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindUniformBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindUniformBuffers, valuePointer, sizeof(o->maxPerStageDescriptorUpdateAfterBindUniformBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindStorageBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUpdateAfterBindStorageBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindStorageBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindStorageBuffers, valuePointer, sizeof(o->maxPerStageDescriptorUpdateAfterBindStorageBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindSampledImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUpdateAfterBindSampledImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindSampledImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindSampledImages, valuePointer, sizeof(o->maxPerStageDescriptorUpdateAfterBindSampledImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindStorageImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUpdateAfterBindStorageImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindStorageImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindStorageImages, valuePointer, sizeof(o->maxPerStageDescriptorUpdateAfterBindStorageImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageDescriptorUpdateAfterBindInputAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindInputAttachments, valuePointer, sizeof(o->maxPerStageDescriptorUpdateAfterBindInputAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageUpdateAfterBindResourcesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerStageUpdateAfterBindResources);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageUpdateAfterBindResourcesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerStageUpdateAfterBindResources, valuePointer, sizeof(o->maxPerStageUpdateAfterBindResources));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindSamplersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindSamplers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindSamplersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindSamplers, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindSamplers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindUniformBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindUniformBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindUniformBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindUniformBuffers, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindUniformBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindUniformBuffersDynamic));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindStorageBuffersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindStorageBuffers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindStorageBuffersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindStorageBuffers, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindStorageBuffers));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamicNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindStorageBuffersDynamic));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindSampledImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindSampledImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindSampledImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindSampledImages, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindSampledImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindStorageImagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindStorageImages);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindStorageImagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindStorageImages, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindStorageImages));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDescriptorSetUpdateAfterBindInputAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDescriptorSetUpdateAfterBindInputAttachments, valuePointer, sizeof(o->maxDescriptorSetUpdateAfterBindInputAttachments));
}


