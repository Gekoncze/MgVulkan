#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSampleLocationsInfoEXT);
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSampleLocationsPerPixelNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsPerPixel);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSampleLocationsPerPixelNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsPerPixel, valuePointer, sizeof(o->sampleLocationsPerPixel));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSampleLocationGridSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationGridSize);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSampleLocationGridSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationGridSize, valuePointer, sizeof(o->sampleLocationGridSize));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSampleLocationsCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsCount);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSampleLocationsCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsCount, valuePointer, sizeof(o->sampleLocationsCount));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getPSampleLocationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pSampleLocations);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setPSampleLocationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSampleLocations, &valuePointer, sizeof(o->pSampleLocations));
}


