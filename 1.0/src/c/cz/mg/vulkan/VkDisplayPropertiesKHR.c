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

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDisplayPropertiesKHR));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getDisplayNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->display);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setDisplayNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->display, valuePointer, sizeof(o->display));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getDisplayNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->displayName);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setDisplayNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayName, &valuePointer, sizeof(o->displayName));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPhysicalDimensionsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDimensions);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPhysicalDimensionsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDimensions, valuePointer, sizeof(o->physicalDimensions));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPhysicalResolutionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalResolution);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPhysicalResolutionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalResolution, valuePointer, sizeof(o->physicalResolution));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getSupportedTransformsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->supportedTransforms);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setSupportedTransformsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->supportedTransforms, valuePointer, sizeof(o->supportedTransforms));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPlaneReorderPossibleNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->planeReorderPossible);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPlaneReorderPossibleNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->planeReorderPossible, valuePointer, sizeof(o->planeReorderPossible));
}

jlong Java_cz_mg_vulkan_VkDisplayPropertiesKHR_getPersistentContentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->persistentContent);
}

void Java_cz_mg_vulkan_VkDisplayPropertiesKHR_setPersistentContentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPropertiesKHR* o = (VkDisplayPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->persistentContent, valuePointer, sizeof(o->persistentContent));
}


