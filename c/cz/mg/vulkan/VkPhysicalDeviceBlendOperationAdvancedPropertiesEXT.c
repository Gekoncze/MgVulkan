#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendMaxColorAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->advancedBlendMaxColorAttachments));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendMaxColorAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->advancedBlendMaxColorAttachments, jniLongToPointer(valueAddress), sizeof(o->advancedBlendMaxColorAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendIndependentBlend(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->advancedBlendIndependentBlend));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendIndependentBlend(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->advancedBlendIndependentBlend, jniLongToPointer(valueAddress), sizeof(o->advancedBlendIndependentBlend));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendNonPremultipliedSrcColor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->advancedBlendNonPremultipliedSrcColor));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendNonPremultipliedSrcColor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->advancedBlendNonPremultipliedSrcColor, jniLongToPointer(valueAddress), sizeof(o->advancedBlendNonPremultipliedSrcColor));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendNonPremultipliedDstColor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->advancedBlendNonPremultipliedDstColor));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendNonPremultipliedDstColor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->advancedBlendNonPremultipliedDstColor, jniLongToPointer(valueAddress), sizeof(o->advancedBlendNonPremultipliedDstColor));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendCorrelatedOverlap(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->advancedBlendCorrelatedOverlap));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendCorrelatedOverlap(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->advancedBlendCorrelatedOverlap, jniLongToPointer(valueAddress), sizeof(o->advancedBlendCorrelatedOverlap));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendAllOperations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->advancedBlendAllOperations));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendAllOperations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->advancedBlendAllOperations, jniLongToPointer(valueAddress), sizeof(o->advancedBlendAllOperations));
}

