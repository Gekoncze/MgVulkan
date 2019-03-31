#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSampleLocationsPropertiesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSampleLocationSampleCounts(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleLocationSampleCounts));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSampleLocationSampleCounts(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sampleLocationSampleCounts, jniLongToPointer(valueAddress), sizeof(o->sampleLocationSampleCounts));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_getMaxSampleLocationGridSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSampleLocationGridSize));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_setMaxSampleLocationGridSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->maxSampleLocationGridSize, jniLongToPointer(valueAddress), sizeof(o->maxSampleLocationGridSize));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSampleLocationCoordinateRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleLocationCoordinateRange));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSampleLocationCoordinateRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    memcpy(o->sampleLocationCoordinateRange, jniLongToPointer(valueAddress), sizeof(o->sampleLocationCoordinateRange));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_getSampleLocationSubPixelBits(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampleLocationSubPixelBits));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_setSampleLocationSubPixelBits(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sampleLocationSubPixelBits, jniLongToPointer(valueAddress), sizeof(o->sampleLocationSubPixelBits));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_getVariableSampleLocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->variableSampleLocations));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSampleLocationsPropertiesEXT_setVariableSampleLocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSampleLocationsPropertiesEXT* o = (VkPhysicalDeviceSampleLocationsPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->variableSampleLocations, jniLongToPointer(valueAddress), sizeof(o->variableSampleLocations));
}

