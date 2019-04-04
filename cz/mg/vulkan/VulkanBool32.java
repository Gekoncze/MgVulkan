package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBool32.html">khronos documentation</a>
 **/
public class VulkanBool32 extends VulkanUInt32 {
    public VulkanBool32(){
        super(new VkBool32());
    }

    public VulkanBool32(VkBool32 vk){
        super(vk);
    }

    @Override
    public VkBool32 getVk(){
        return (VkBool32) super.getVk();
    }

    public VulkanBool32(int value){
        super(new VkBool32(value));
    }

    public static class Array extends VulkanBool32 implements cz.mg.collections.array.ReadonlyArray<VulkanBool32> {
        public Array(VkBool32.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBool32.Array(count));
        }

        public Array(int count, VulkanBool32 o){
            this(new VkBool32.Array(count, o.getVk()));
        }

        @Override
        public VkBool32.Array getVk(){
            return (VkBool32.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBool32 get(int i){
            return new VulkanBool32(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBool32.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBool32.Pointer());
        }

        public Pointer(long value) {
            this(new VkBool32.Pointer(value));
        }

        @Override
        public VkBool32.Pointer getVk(){
            return (VkBool32.Pointer) super.getVk();
        }

        public static class Array extends VulkanBool32.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBool32.Pointer> {
            public Array(int count) {
                super(new VkBool32.Pointer.Array(count));
            }

            public Array(VulkanBool32[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBool32.Pointer.Array getVk(){
                return (VkBool32.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBool32.Pointer get(int i){
                return new VulkanBool32.Pointer(getVk().get(i));
            }
        }
    }
}
