#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSampleLocationsPropertiesEXT);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceSampleLocationsPropertiesEXT));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSampleLocationSampleCountsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationSampleCounts);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSampleLocationSampleCountsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationSampleCounts, valuePointer, sizeof(o->sampleLocationSampleCounts));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_getMaxSampleLocationGridSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSampleLocationGridSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setMaxSampleLocationGridSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSampleLocationGridSize, valuePointer, sizeof(o->maxSampleLocationGridSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSampleLocationCoordinateRangeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->sampleLocationCoordinateRange);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSampleLocationCoordinateRangeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->sampleLocationCoordinateRange, valuePointer, sizeof(o->sampleLocationCoordinateRange));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSampleLocationSubPixelBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampleLocationSubPixelBits);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSampleLocationSubPixelBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampleLocationSubPixelBits, valuePointer, sizeof(o->sampleLocationSubPixelBits));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_getVariableSampleLocationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->variableSampleLocations);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSampleLocationsPropertiesEXT_setVariableSampleLocationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->variableSampleLocations, valuePointer, sizeof(o->variableSampleLocations));
}


