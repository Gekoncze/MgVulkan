#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDiscardRectanglePropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceDiscardRectanglePropertiesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDiscardRectanglePropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDiscardRectanglePropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDiscardRectanglePropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDiscardRectanglePropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceDiscardRectanglePropertiesEXT_getMaxDiscardRectangles(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDiscardRectangles));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceDiscardRectanglePropertiesEXT_setMaxDiscardRectangles(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceDiscardRectanglePropertiesEXT* o = (VkPhysicalDeviceDiscardRectanglePropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxDiscardRectangles, jniLongToPointer(valueAddress), sizeof(o->maxDiscardRectangles));
}

