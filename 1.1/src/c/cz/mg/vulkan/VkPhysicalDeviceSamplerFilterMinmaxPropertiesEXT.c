#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getFilterMinmaxSingleComponentFormatsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->filterMinmaxSingleComponentFormats);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setFilterMinmaxSingleComponentFormatsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->filterMinmaxSingleComponentFormats, valuePointer, sizeof(o->filterMinmaxSingleComponentFormats));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getFilterMinmaxImageComponentMappingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->filterMinmaxImageComponentMapping);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setFilterMinmaxImageComponentMappingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->filterMinmaxImageComponentMapping, valuePointer, sizeof(o->filterMinmaxImageComponentMapping));
}


