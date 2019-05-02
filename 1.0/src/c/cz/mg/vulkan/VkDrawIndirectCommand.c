#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDrawIndirectCommand);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDrawIndirectCommand));
}

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getVertexCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexCount);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setVertexCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexCount, valuePointer, sizeof(o->vertexCount));
}

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getInstanceCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->instanceCount);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setInstanceCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->instanceCount, valuePointer, sizeof(o->instanceCount));
}

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getFirstVertexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->firstVertex);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setFirstVertexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->firstVertex, valuePointer, sizeof(o->firstVertex));
}

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getFirstInstanceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->firstInstance);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setFirstInstanceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->firstInstance, valuePointer, sizeof(o->firstInstance));
}


