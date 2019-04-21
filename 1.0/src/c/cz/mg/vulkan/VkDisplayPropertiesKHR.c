#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayPropertiesKHR);
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getDisplay(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->display);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setDisplay(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->display, valuePointer, sizeof(o->display));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getDisplayName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->displayName);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setDisplayName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayName, &valuePointer, sizeof(o->displayName));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPhysicalDimensions(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDimensions);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPhysicalDimensions(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDimensions, valuePointer, sizeof(o->physicalDimensions));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPhysicalResolution(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalResolution);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPhysicalResolution(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalResolution, valuePointer, sizeof(o->physicalResolution));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getSupportedTransforms(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedTransforms);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setSupportedTransforms(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedTransforms, valuePointer, sizeof(o->supportedTransforms));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPlaneReorderPossible(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->planeReorderPossible);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPlaneReorderPossible(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->planeReorderPossible, valuePointer, sizeof(o->planeReorderPossible));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPersistentContent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->persistentContent);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPersistentContent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->persistentContent, valuePointer, sizeof(o->persistentContent));
}


