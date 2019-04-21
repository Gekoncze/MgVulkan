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

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSampleLocationsPerPixel(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsPerPixel);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSampleLocationsPerPixel(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsPerPixel, valuePointer, sizeof(o->sampleLocationsPerPixel));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSampleLocationGridSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationGridSize);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSampleLocationGridSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationGridSize, valuePointer, sizeof(o->sampleLocationGridSize));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getSampleLocationsCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationsCount);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setSampleLocationsCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationsCount, valuePointer, sizeof(o->sampleLocationsCount));
}

jlong Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_getPSampleLocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pSampleLocations);
}

void Java_cz_mg_vulkan_VkSampleLocationsInfoEXT_setPSampleLocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationsInfoEXT* o = (VkSampleLocationsInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSampleLocations, &valuePointer, sizeof(o->pSampleLocations));
}


