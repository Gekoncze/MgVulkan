package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayKHR extends VulkanHandle {
    public VulkanDisplayKHR(){
        super(new VkDisplayKHR());
    }

    public VulkanDisplayKHR(VkDisplayKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayKHR getVk(){
        return (VkDisplayKHR) super.getVk();
    }

    public VulkanDisplayKHR(int value){
        super(new VkDisplayKHR(value));
    }

    public static class Array extends VulkanDisplayKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayKHR> {
        public Array(VkDisplayKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayKHR.Array(count));
        }

        public Array(int count, VulkanDisplayKHR o){
            this(new VkDisplayKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayKHR.Array getVk(){
            return (VkDisplayKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayKHR get(int i){
            return new VulkanDisplayKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayKHR.Pointer(value));
        }

        @Override
        public VkDisplayKHR.Pointer getVk(){
            return (VkDisplayKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayKHR.Pointer.Array getVk(){
                return (VkDisplayKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayKHR.Pointer get(int i){
                return new VulkanDisplayKHR.Pointer(getVk().get(i));
            }
        }
    }
}
