#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_getMaxVertexAttribDivisorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxVertexAttribDivisor);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT_setMaxVertexAttribDivisorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT* o = (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxVertexAttribDivisor, valuePointer, sizeof(o->maxVertexAttribDivisor));
}


