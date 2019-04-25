#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendMaxColorAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendMaxColorAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendMaxColorAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendMaxColorAttachments, valuePointer, sizeof(o->advancedBlendMaxColorAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendIndependentBlendNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendIndependentBlend);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendIndependentBlendNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendIndependentBlend, valuePointer, sizeof(o->advancedBlendIndependentBlend));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendNonPremultipliedSrcColorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendNonPremultipliedSrcColor);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendNonPremultipliedSrcColorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendNonPremultipliedSrcColor, valuePointer, sizeof(o->advancedBlendNonPremultipliedSrcColor));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendNonPremultipliedDstColorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendNonPremultipliedDstColor);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendNonPremultipliedDstColorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendNonPremultipliedDstColor, valuePointer, sizeof(o->advancedBlendNonPremultipliedDstColor));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendCorrelatedOverlapNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendCorrelatedOverlap);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendCorrelatedOverlapNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendCorrelatedOverlap, valuePointer, sizeof(o->advancedBlendCorrelatedOverlap));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendAllOperationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendAllOperations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendAllOperationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendAllOperations, valuePointer, sizeof(o->advancedBlendAllOperations));
}


