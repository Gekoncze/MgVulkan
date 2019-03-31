#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceDescriptorIndexingPropertiesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxUpdateAfterBindDescriptorsInAllPools(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxUpdateAfterBindDescriptorsInAllPools));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxUpdateAfterBindDescriptorsInAllPools(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxUpdateAfterBindDescriptorsInAllPools, jniLongToPointer(valueAddress), sizeof(o->maxUpdateAfterBindDescriptorsInAllPools));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderUniformBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderUniformBufferArrayNonUniformIndexingNative));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderUniformBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderUniformBufferArrayNonUniformIndexingNative, jniLongToPointer(valueAddress), sizeof(o->shaderUniformBufferArrayNonUniformIndexingNative));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderSampledImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderSampledImageArrayNonUniformIndexingNative));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderSampledImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderSampledImageArrayNonUniformIndexingNative, jniLongToPointer(valueAddress), sizeof(o->shaderSampledImageArrayNonUniformIndexingNative));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderStorageBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageBufferArrayNonUniformIndexingNative));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderStorageBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderStorageBufferArrayNonUniformIndexingNative, jniLongToPointer(valueAddress), sizeof(o->shaderStorageBufferArrayNonUniformIndexingNative));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderStorageImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageImageArrayNonUniformIndexingNative));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderStorageImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderStorageImageArrayNonUniformIndexingNative, jniLongToPointer(valueAddress), sizeof(o->shaderStorageImageArrayNonUniformIndexingNative));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getShaderInputAttachmentArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderInputAttachmentArrayNonUniformIndexingNative));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setShaderInputAttachmentArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderInputAttachmentArrayNonUniformIndexingNative, jniLongToPointer(valueAddress), sizeof(o->shaderInputAttachmentArrayNonUniformIndexingNative));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getRobustBufferAccessUpdateAfterBind(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->robustBufferAccessUpdateAfterBind));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setRobustBufferAccessUpdateAfterBind(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->robustBufferAccessUpdateAfterBind, jniLongToPointer(valueAddress), sizeof(o->robustBufferAccessUpdateAfterBind));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getQuadDivergentImplicitLod(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->quadDivergentImplicitLod));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setQuadDivergentImplicitLod(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->quadDivergentImplicitLod, jniLongToPointer(valueAddress), sizeof(o->quadDivergentImplicitLod));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindSamplers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorUpdateAfterBindSamplers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindSamplers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindSamplers, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorUpdateAfterBindSamplers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindUniformBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorUpdateAfterBindUniformBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindUniformBuffers, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorUpdateAfterBindUniformBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindStorageBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorUpdateAfterBindStorageBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindStorageBuffers, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorUpdateAfterBindStorageBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindSampledImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorUpdateAfterBindSampledImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindSampledImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindSampledImages, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorUpdateAfterBindSampledImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindStorageImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorUpdateAfterBindStorageImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindStorageImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindStorageImages, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorUpdateAfterBindStorageImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageDescriptorUpdateAfterBindInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageDescriptorUpdateAfterBindInputAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageDescriptorUpdateAfterBindInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxPerStageDescriptorUpdateAfterBindInputAttachments, jniLongToPointer(valueAddress), sizeof(o->maxPerStageDescriptorUpdateAfterBindInputAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxPerStageUpdateAfterBindResources(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPerStageUpdateAfterBindResources));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxPerStageUpdateAfterBindResources(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxPerStageUpdateAfterBindResources, jniLongToPointer(valueAddress), sizeof(o->maxPerStageUpdateAfterBindResources));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindSamplers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindSamplers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindSamplers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindSamplers, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindSamplers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindUniformBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindUniformBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindUniformBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindUniformBuffers, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindUniformBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindUniformBuffersDynamic));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindUniformBuffersDynamic));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindStorageBuffers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindStorageBuffers));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindStorageBuffers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindStorageBuffers, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindStorageBuffers));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindStorageBuffersDynamic));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindStorageBuffersDynamic));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindSampledImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindSampledImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindSampledImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindSampledImages, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindSampledImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindStorageImages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindStorageImages));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindStorageImages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindStorageImages, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindStorageImages));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_getMaxDescriptorSetUpdateAfterBindInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDescriptorSetUpdateAfterBindInputAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingPropertiesEXT_setMaxDescriptorSetUpdateAfterBindInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingPropertiesEXT* o = (VkPhysicalDeviceDescriptorIndexingPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDescriptorSetUpdateAfterBindInputAttachments, jniLongToPointer(valueAddress), sizeof(o->maxDescriptorSetUpdateAfterBindInputAttachments));
}

