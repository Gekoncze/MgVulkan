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

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getVertexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexCount);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setVertexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexCount, valuePointer, sizeof(o->vertexCount));
}

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getInstanceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->instanceCount);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setInstanceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->instanceCount, valuePointer, sizeof(o->instanceCount));
}

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getFirstVertex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->firstVertex);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setFirstVertex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->firstVertex, valuePointer, sizeof(o->firstVertex));
}

jlong Java_cz_mg_vulkan_VkDrawIndirectCommand_getFirstInstance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->firstInstance);
}

void Java_cz_mg_vulkan_VkDrawIndirectCommand_setFirstInstance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->firstInstance, valuePointer, sizeof(o->firstInstance));
}


