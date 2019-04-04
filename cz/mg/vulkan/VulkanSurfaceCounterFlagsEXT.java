package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCounterFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanSurfaceCounterFlagsEXT extends VulkanFlags {
    public VulkanSurfaceCounterFlagsEXT(){
        super(new VkSurfaceCounterFlagsEXT());
    }

    public VulkanSurfaceCounterFlagsEXT(VkSurfaceCounterFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkSurfaceCounterFlagsEXT getVk(){
        return (VkSurfaceCounterFlagsEXT) super.getVk();
    }

    public VulkanSurfaceCounterFlagsEXT(int value){
        super(new VkSurfaceCounterFlagsEXT(value));
    }

    public static class Array extends VulkanSurfaceCounterFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCounterFlagsEXT> {
        public Array(VkSurfaceCounterFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceCounterFlagsEXT.Array(count));
        }

        public Array(int count, VulkanSurfaceCounterFlagsEXT o){
            this(new VkSurfaceCounterFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceCounterFlagsEXT.Array getVk(){
            return (VkSurfaceCounterFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceCounterFlagsEXT get(int i){
            return new VulkanSurfaceCounterFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceCounterFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceCounterFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceCounterFlagsEXT.Pointer(value));
        }

        @Override
        public VkSurfaceCounterFlagsEXT.Pointer getVk(){
            return (VkSurfaceCounterFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceCounterFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCounterFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkSurfaceCounterFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanSurfaceCounterFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceCounterFlagsEXT.Pointer.Array getVk(){
                return (VkSurfaceCounterFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceCounterFlagsEXT.Pointer get(int i){
                return new VulkanSurfaceCounterFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
