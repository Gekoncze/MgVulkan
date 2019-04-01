#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_getMaxVertexAttribDivisor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexAttribDivisor);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_setMaxVertexAttribDivisor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexAttribDivisor, valuePointer, sizeof(o->maxVertexAttribDivisor));
}


