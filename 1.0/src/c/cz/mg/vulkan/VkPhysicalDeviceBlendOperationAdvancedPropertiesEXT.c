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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendMaxColorAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendMaxColorAttachments);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendMaxColorAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendMaxColorAttachments, valuePointer, sizeof(o->advancedBlendMaxColorAttachments));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendIndependentBlend(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendIndependentBlend);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendIndependentBlend(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendIndependentBlend, valuePointer, sizeof(o->advancedBlendIndependentBlend));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendNonPremultipliedSrcColor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendNonPremultipliedSrcColor);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendNonPremultipliedSrcColor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendNonPremultipliedSrcColor, valuePointer, sizeof(o->advancedBlendNonPremultipliedSrcColor));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendNonPremultipliedDstColor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendNonPremultipliedDstColor);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendNonPremultipliedDstColor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendNonPremultipliedDstColor, valuePointer, sizeof(o->advancedBlendNonPremultipliedDstColor));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendCorrelatedOverlap(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendCorrelatedOverlap);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendCorrelatedOverlap(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendCorrelatedOverlap, valuePointer, sizeof(o->advancedBlendCorrelatedOverlap));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_getAdvancedBlendAllOperations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->advancedBlendAllOperations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT_setAdvancedBlendAllOperations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT* o = (VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->advancedBlendAllOperations, valuePointer, sizeof(o->advancedBlendAllOperations));
}


