#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceDescriptorIndexingFeaturesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderInputAttachmentArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderInputAttachmentArrayDynamicIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderInputAttachmentArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderInputAttachmentArrayDynamicIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderInputAttachmentArrayDynamicIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderUniformTexelBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderUniformTexelBufferArrayDynamicIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderUniformTexelBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderUniformTexelBufferArrayDynamicIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderUniformTexelBufferArrayDynamicIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageTexelBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageTexelBufferArrayDynamicIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageTexelBufferArrayDynamicIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderStorageTexelBufferArrayDynamicIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderStorageTexelBufferArrayDynamicIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderUniformBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderUniformBufferArrayNonUniformIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderUniformBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderUniformBufferArrayNonUniformIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderUniformBufferArrayNonUniformIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderSampledImageArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderSampledImageArrayNonUniformIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderSampledImageArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderSampledImageArrayNonUniformIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderSampledImageArrayNonUniformIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageBufferArrayNonUniformIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderStorageBufferArrayNonUniformIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderStorageBufferArrayNonUniformIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageImageArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageImageArrayNonUniformIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageImageArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderStorageImageArrayNonUniformIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderStorageImageArrayNonUniformIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderInputAttachmentArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderInputAttachmentArrayNonUniformIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderInputAttachmentArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderInputAttachmentArrayNonUniformIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderInputAttachmentArrayNonUniformIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderUniformTexelBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderUniformTexelBufferArrayNonUniformIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderUniformTexelBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderUniformTexelBufferArrayNonUniformIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderUniformTexelBufferArrayNonUniformIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageTexelBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->shaderStorageTexelBufferArrayNonUniformIndexing));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageTexelBufferArrayNonUniformIndexing(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->shaderStorageTexelBufferArrayNonUniformIndexing, jniLongToPointer(valueAddress), sizeof(o->shaderStorageTexelBufferArrayNonUniformIndexing));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingUniformBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingUniformBufferUpdateAfterBind));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingUniformBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingUniformBufferUpdateAfterBind, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingUniformBufferUpdateAfterBind));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingSampledImageUpdateAfterBind(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingSampledImageUpdateAfterBind));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingSampledImageUpdateAfterBind(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingSampledImageUpdateAfterBind, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingSampledImageUpdateAfterBind));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingStorageImageUpdateAfterBind(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingStorageImageUpdateAfterBind));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingStorageImageUpdateAfterBind(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingStorageImageUpdateAfterBind, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingStorageImageUpdateAfterBind));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingStorageBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingStorageBufferUpdateAfterBind));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingStorageBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingStorageBufferUpdateAfterBind, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingStorageBufferUpdateAfterBind));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingUniformTexelBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingUniformTexelBufferUpdateAfterBind));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingUniformTexelBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingUniformTexelBufferUpdateAfterBind, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingUniformTexelBufferUpdateAfterBind));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingStorageTexelBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingStorageTexelBufferUpdateAfterBind));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingStorageTexelBufferUpdateAfterBind(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingStorageTexelBufferUpdateAfterBind, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingStorageTexelBufferUpdateAfterBind));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingUpdateUnusedWhilePending(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingUpdateUnusedWhilePending));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingUpdateUnusedWhilePending(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingUpdateUnusedWhilePending, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingUpdateUnusedWhilePending));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingPartiallyBound(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingPartiallyBound));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingPartiallyBound(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingPartiallyBound, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingPartiallyBound));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingVariableDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorBindingVariableDescriptorCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingVariableDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->descriptorBindingVariableDescriptorCount, jniLongToPointer(valueAddress), sizeof(o->descriptorBindingVariableDescriptorCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getRuntimeDescriptorArray(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->runtimeDescriptorArray));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setRuntimeDescriptorArray(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    memcpy(&o->runtimeDescriptorArray, jniLongToPointer(valueAddress), sizeof(o->runtimeDescriptorArray));
}

