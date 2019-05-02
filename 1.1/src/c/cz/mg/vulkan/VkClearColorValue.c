#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkClearColorValue_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkClearColorValue);
}

void Java_cz_mg_vulkan_VkClearColorValue_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkClearColorValue));
}

jlong Java_cz_mg_vulkan_VkClearColorValue_getFloat32Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearColorValue* o = (VkClearColorValue*)jniLongToPointer(address);
    return jniPointerToLong(o->float32);
}

void Java_cz_mg_vulkan_VkClearColorValue_setFloat32Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearColorValue* o = (VkClearColorValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->float32, valuePointer, sizeof(o->float32));
}

jlong Java_cz_mg_vulkan_VkClearColorValue_getInt32Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearColorValue* o = (VkClearColorValue*)jniLongToPointer(address);
    return jniPointerToLong(o->int32);
}

void Java_cz_mg_vulkan_VkClearColorValue_setInt32Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearColorValue* o = (VkClearColorValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->int32, valuePointer, sizeof(o->int32));
}

jlong Java_cz_mg_vulkan_VkClearColorValue_getUint32Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearColorValue* o = (VkClearColorValue*)jniLongToPointer(address);
    return jniPointerToLong(o->uint32);
}

void Java_cz_mg_vulkan_VkClearColorValue_setUint32Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearColorValue* o = (VkClearColorValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->uint32, valuePointer, sizeof(o->uint32));
}


