#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDiscardRectanglePropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceDiscardRectanglePropertiesEXT);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDiscardRectanglePropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDiscardRectanglePropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDiscardRectanglePropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDiscardRectanglePropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceDiscardRectanglePropertiesEXT_getMaxDiscardRectanglesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDiscardRectangles);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceDiscardRectanglePropertiesEXT_setMaxDiscardRectanglesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDiscardRectangles, valuePointer, sizeof(o->maxDiscardRectangles));
}


