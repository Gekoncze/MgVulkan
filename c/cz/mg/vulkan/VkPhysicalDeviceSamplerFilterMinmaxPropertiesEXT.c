#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getFilterMinmaxSingleComponentFormats(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->filterMinmaxSingleComponentFormats));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setFilterMinmaxSingleComponentFormats(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->filterMinmaxSingleComponentFormats, jniLongToPointer(valueAddress), sizeof(o->filterMinmaxSingleComponentFormats));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_getFilterMinmaxImageComponentMapping(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->filterMinmaxImageComponentMapping));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT_setFilterMinmaxImageComponentMapping(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT* o = (VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT*)jniLongToPointer(address);
    memcpy(&o->filterMinmaxImageComponentMapping, jniLongToPointer(valueAddress), sizeof(o->filterMinmaxImageComponentMapping));
}

