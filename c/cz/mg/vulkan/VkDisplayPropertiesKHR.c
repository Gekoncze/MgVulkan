#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayPropertiesKHR);
}

jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_getDisplay(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->display));
}

void Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_setDisplay(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->display, jniLongToPointer(valueAddress), sizeof(o->display));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_getDisplayName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->displayName));
}

void Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_setDisplayName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->displayName, jniLongToPointer(valueAddress), sizeof(o->displayName));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_getPhysicalDimensions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->physicalDimensions));
}

void Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_setPhysicalDimensions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->physicalDimensions, jniLongToPointer(valueAddress), sizeof(o->physicalDimensions));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_getPhysicalResolution(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->physicalResolution));
}

void Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_setPhysicalResolution(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->physicalResolution, jniLongToPointer(valueAddress), sizeof(o->physicalResolution));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_getSupportedTransforms(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->supportedTransforms));
}

void Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_setSupportedTransforms(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->supportedTransforms, jniLongToPointer(valueAddress), sizeof(o->supportedTransforms));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_getPlaneReorderPossible(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->planeReorderPossible));
}

void Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_setPlaneReorderPossible(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->planeReorderPossible, jniLongToPointer(valueAddress), sizeof(o->planeReorderPossible));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_getPersistentContent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->persistentContent));
}

void Java_cz_mg_vulkan_vk_VkDisplayPropertiesKHR_setPersistentContent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->persistentContent, jniLongToPointer(valueAddress), sizeof(o->persistentContent));
}

