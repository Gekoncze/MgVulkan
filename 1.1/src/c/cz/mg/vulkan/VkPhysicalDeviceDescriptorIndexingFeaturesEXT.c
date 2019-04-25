#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceDescriptorIndexingFeaturesEXT);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderInputAttachmentArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderInputAttachmentArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderInputAttachmentArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderInputAttachmentArrayDynamicIndexing, valuePointer, sizeof(o->shaderInputAttachmentArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderUniformTexelBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderUniformTexelBufferArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderUniformTexelBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderUniformTexelBufferArrayDynamicIndexing, valuePointer, sizeof(o->shaderUniformTexelBufferArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageTexelBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageTexelBufferArrayDynamicIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageTexelBufferArrayDynamicIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageTexelBufferArrayDynamicIndexing, valuePointer, sizeof(o->shaderStorageTexelBufferArrayDynamicIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderUniformBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderUniformBufferArrayNonUniformIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderUniformBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderUniformBufferArrayNonUniformIndexing, valuePointer, sizeof(o->shaderUniformBufferArrayNonUniformIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderSampledImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderSampledImageArrayNonUniformIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderSampledImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderSampledImageArrayNonUniformIndexing, valuePointer, sizeof(o->shaderSampledImageArrayNonUniformIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageBufferArrayNonUniformIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageBufferArrayNonUniformIndexing, valuePointer, sizeof(o->shaderStorageBufferArrayNonUniformIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageImageArrayNonUniformIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageImageArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageImageArrayNonUniformIndexing, valuePointer, sizeof(o->shaderStorageImageArrayNonUniformIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderInputAttachmentArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderInputAttachmentArrayNonUniformIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderInputAttachmentArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderInputAttachmentArrayNonUniformIndexing, valuePointer, sizeof(o->shaderInputAttachmentArrayNonUniformIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderUniformTexelBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderUniformTexelBufferArrayNonUniformIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderUniformTexelBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderUniformTexelBufferArrayNonUniformIndexing, valuePointer, sizeof(o->shaderUniformTexelBufferArrayNonUniformIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getShaderStorageTexelBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->shaderStorageTexelBufferArrayNonUniformIndexing);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setShaderStorageTexelBufferArrayNonUniformIndexingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->shaderStorageTexelBufferArrayNonUniformIndexing, valuePointer, sizeof(o->shaderStorageTexelBufferArrayNonUniformIndexing));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingUniformBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingUniformBufferUpdateAfterBind);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingUniformBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingUniformBufferUpdateAfterBind, valuePointer, sizeof(o->descriptorBindingUniformBufferUpdateAfterBind));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingSampledImageUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingSampledImageUpdateAfterBind);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingSampledImageUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingSampledImageUpdateAfterBind, valuePointer, sizeof(o->descriptorBindingSampledImageUpdateAfterBind));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingStorageImageUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingStorageImageUpdateAfterBind);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingStorageImageUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingStorageImageUpdateAfterBind, valuePointer, sizeof(o->descriptorBindingStorageImageUpdateAfterBind));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingStorageBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingStorageBufferUpdateAfterBind);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingStorageBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingStorageBufferUpdateAfterBind, valuePointer, sizeof(o->descriptorBindingStorageBufferUpdateAfterBind));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingUniformTexelBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingUniformTexelBufferUpdateAfterBind);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingUniformTexelBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingUniformTexelBufferUpdateAfterBind, valuePointer, sizeof(o->descriptorBindingUniformTexelBufferUpdateAfterBind));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingStorageTexelBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingStorageTexelBufferUpdateAfterBind);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingStorageTexelBufferUpdateAfterBindNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingStorageTexelBufferUpdateAfterBind, valuePointer, sizeof(o->descriptorBindingStorageTexelBufferUpdateAfterBind));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingUpdateUnusedWhilePendingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingUpdateUnusedWhilePending);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingUpdateUnusedWhilePendingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingUpdateUnusedWhilePending, valuePointer, sizeof(o->descriptorBindingUpdateUnusedWhilePending));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingPartiallyBoundNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingPartiallyBound);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingPartiallyBoundNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingPartiallyBound, valuePointer, sizeof(o->descriptorBindingPartiallyBound));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getDescriptorBindingVariableDescriptorCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorBindingVariableDescriptorCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setDescriptorBindingVariableDescriptorCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorBindingVariableDescriptorCount, valuePointer, sizeof(o->descriptorBindingVariableDescriptorCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_getRuntimeDescriptorArrayNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->runtimeDescriptorArray);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDescriptorIndexingFeaturesEXT_setRuntimeDescriptorArrayNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDescriptorIndexingFeaturesEXT* o = (VkPhysicalDeviceDescriptorIndexingFeaturesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->runtimeDescriptorArray, valuePointer, sizeof(o->runtimeDescriptorArray));
}


